package fileutil

import (
	"path/filepath"
	"strings"
	"tplcore/config"
)

// get file name, not contain suffix
func GetFileName(f string) (name string) {
	if len(f) <= 0 {
		return
	}
	fBase := filepath.Base(f)
	fBaseArr := strings.Split(fBase, ".")
	if len(fBaseArr) < 2 {
		return
	}
	return fBaseArr[0]
}

// get file name and suffix
func GetFileNameAndSuffix(f string) (name string, suffix string) {
	if len(f) <= 0 {
		return
	}
	fBase := filepath.Base(f)
	fBaseArr := strings.Split(fBase, ".")
	if len(fBaseArr) < 2 {
		return
	}

	return fBaseArr[0], fBaseArr[1]
}

// get file folder path
func GetDirName(f string) (dp string) {
	if len(f) <= 0 {
		return
	}
	fDir := filepath.Dir(f)
	return fDir
}

// get file suffix
func GetFileSuffix(f string) (suffix string) {
	if len(f) <= 0 {
		return
	}
	fBase := filepath.Base(f)
	fBaseArr := strings.Split(fBase, ".")
	if len(fBaseArr) < 2 {
		return
	}
	return fBaseArr[1]
}

// get lang file suffix
func GetLangSuffix(t int) (suffix string) {
	switch t {
	case config.Java:
		return ".java"
	case config.Csharp:
		return ".cs"
	case config.Cpp:
		return ".cpp"
	case config.GoLang:
		return ".go"
	case config.Lua:
		return ".lua"
	default:
		return
	}
}
