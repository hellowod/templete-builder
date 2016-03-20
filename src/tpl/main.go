package main

import (
	"bytes"
	"os"
	"path/filepath"
	"strings"
	"text/template"
	"tplcore/config"
	"tplcore/fileutil"
	"tplcore/log"
	"tplcore/table"
	"tplcore/util"
)

var configInput = "config"
var configOut = "output"
var configTpl = "templete/csharp.tpl"

func main() {
	argnum := len(os.Args)
	if argnum <= 1 {
		util.PrintLog()
	}

	/*
		if len(table.Ags.In.Value) < 1 {
			configInput = table.Ags.In.Value
		}
		if len(table.Ags.Out.Value) < 1 {
			configOut = table.Ags.Out.Value
		}
		if len(table.Ags.Tpl.Value) < 1 {
			configTpl = table.Ags.Tpl.Value
		}
	*/
	filepath.Walk(configInput, func(name string, file os.FileInfo, err error) error {
		if err != nil {
			return err
		}
		if file.IsDir() {
			return nil
		}
		// make sheet
		sheet := NewTableSheet(name)
		// new out file name
		newName := getNewFileName(name, config.Csharp)
		// parse templete
		eor := ParseTemplete(newName, sheet)
		if eor != nil {
			return eor
		}

		log.Info("parse finish: " + name)

		return nil
	})
}

func NewTableSheet(name string) (s table.Sheet) {
	fileString := fileutil.ReadFile(name)

	lines := strings.Split(fileString, "\n")
	if len(lines) < 3 {
		return
	}
	types := strings.Split(lines[0], "\t")
	fields := strings.Split(lines[1], "\t")
	comments := strings.Split(lines[2], "\t")

	sheet := table.Sheet{}
	sheet.Name = fileutil.GetFileName(name)
	sheet.Colums = make([]*table.Colum, 0)
	for i, v := range types {
		v = strings.TrimSpace(v)
		if len(v) <= 0 {
			continue
		}
		t := strings.TrimSpace(types[i])
		f := strings.TrimSpace(fields[i])
		c := strings.TrimSpace(comments[i])
		col := table.Colum{t, f, c}
		sheet.Colums = append(sheet.Colums, &col)
	}
	return sheet
}

func ParseTemplete(name string, sheet table.Sheet) error {
	tpl := template.New("tplname")
	tpl, _ = tpl.Parse(fileutil.ReadFile(configTpl))

	buf := new(bytes.Buffer)

	err := tpl.Execute(buf, sheet)
	if err != nil {
		return err
	}

	outPath := filepath.Join(configOut, name)
	fileutil.WriteFile(outPath, buf.String())

	return nil
}

func getNewFileName(name string, t int) string {
	if len(name) <= 0 {
		return ""
	}
	fileName := fileutil.GetFileName(name) + "Cfg"
	fileSuffixName := fileutil.GetLangSuffix(t)

	return fileName + fileSuffixName
}
