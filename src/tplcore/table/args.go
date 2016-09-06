package table

import (
	"errors"
	"strings"
	"tplcore/config"
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
	if len(args) <= 0 {
		return nil
	}
	Ags = new(Args)
	for i, v := range args {
		val := strings.TrimSpace(v)
		if config.Out == val {
			param, err := newParam(val, args[i+1])
			if err != nil {
				return err
			}
			Ags.Out = param
		}
		if config.In == val {
			param, err := newParam(val, args[i+1])
			if err != nil {
				return err
			}
			Ags.In = param
		}
		if config.Tpl == val {
			param, err := newParam(val, args[i+1])
			if err != nil {
				return err
			}
			Ags.Tpl = param
		}
		if config.Lang == val {
			param, err := newParam(val, args[i+1])
			if err != nil {
				return err
			}
			Ags.Lang = param
		}
		if config.Help == val {
			param, err := newParam(val, args[i+1])
			if err != nil {
				return err
			}
			Ags.Help = param
		}
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
