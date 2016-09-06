package table

import (
	"errors"
	"strings"
	"tplcore/config"
	"tplcore/util"
)

var Ags *Args

type Param struct {
	Cmd   string
	Value string
}

type Args struct {
	Out  Param
	In   Param
	Tpl  Param
	Lang Param
	Help Param
}

func (p Param) ToString() (str string) {
	return p.Cmd + ":" + p.Value
}

func ParseArgs(args []string) error {
	if len(args) <= 1 {
		return errors.New("param is too short")
	}
	Ags = new(Args)
	count := 0
	for i, v := range args {
		val := strings.TrimSpace(v)
		if config.Out == val {
			param, err := newParam(val, args[i+1])
			if err != nil {
				return err
			}
			Ags.Out = param
			count++
		}
		if config.In == val {
			param, err := newParam(val, args[i+1])
			if err != nil {
				return err
			}
			Ags.In = param
			count++
		}
		if config.Tpl == val {
			param, err := newParam(val, args[i+1])
			if err != nil {
				return err
			}
			Ags.Tpl = param
			count++
		}
		if config.Lang == val {
			param, err := newParam(val, args[i+1])
			if err != nil {
				return err
			}
			Ags.Lang = param
			count++
		}
		if config.Help == val {
			util.LogHelp()
			return nil
		}
	}

	if count != config.Argc {
		return errors.New("param is error!")
	}

	return nil
}

func newParam(cmd string, val string) (p Param, err error) {
	if len(cmd) <= 0 {
		return Param{}, errors.New("param is too short!")
	}

	if len(val) <= 0 {
		return Param{}, errors.New("param is too short!")
	}

	param := Param{cmd, val}
	return param, nil
}
