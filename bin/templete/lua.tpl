[[--
{{.Name}}Cfg.lua

@Author: abaojin
--]]

_Tb_cfg_{{.Name}} = {
	{{range .Colums}}
	[{{.Type}}] = { {{.Field}} }
	{{end}}
}