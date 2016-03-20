package table

import (
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
	Help Param
}

func (p Param) ToString() (str string) {
	return p.Cmd + ":" + p.Value
}

func ParseArgs(args []string) {
	if len(args) <= 0 {
		return
	}
	Ags = new(Args)
	for i, v := range args {
		val := strings.TrimSpace(v)
		if config.Out == val {
			Ags.Out = newParam(val, args[i+1])
		}
		if config.In == val {
			Ags.In = newParam(val, args[i+1])
		}
		if config.Tpl == val {
			Ags.Tpl = newParam(val, args[i+1])
		}
		if config.Help == val {
			Ags.Help = newParam(val, args[i+1])
		}
	}
}

func newParam(cmd string, val string) (p Param) {
	if len(cmd) <= 0 {
		return
	}
	if len(val) <= 0 {
		return
	}
	param := Param{cmd, val}
	return param
}
