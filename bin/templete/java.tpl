package com.config;

import java.util.HashMap;

/***
 * {{.Name}}Tbl.java
 * {{.Name}}Cfg.java
 *
 * @Author: abaojin
 */
public class {{.Name}}Tbl {

	{{range .Colums}}// {{.Comment}}
	private {{.Type}} {{.Field}};
	{{end}}
	{{range .Colums}}
	public {{.Type}} get{{.Field}}(){
		return {{.Field}}
	}
	public void set{{.Field}}({{.Type}} {{.Field}}){
		this.{{.Field}} = {{.Field}}
	}
	{{end}}
}
{{$StringType := "string"}}{{$IntType := "int"}}{{$ByteType := "byte"}}{{$FloatType := "float"}}
public class {{.Name}}Cfg {
	public const string FILENAME = "{{.Name}}";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			{{.Name}}Tbl record = new {{.Name}}Tbl();
			{{range .Colums}}{{if eq .Type $StringType}}record.{{.Field}} = table.GetString(i, "{{.Field}}");{{end}}{{if eq .Type $IntType}}record.{{.Field}} = table.GetInt(i, "{{.Field}}");{{end}}{{if eq .Type $ByteType}}record.{{.Field}} = table.GetByte(i, "{{.Field}}");{{end}}{{if eq .Type $FloatType}}record.{{.Field}} = table.GetFloat(i, "{{.Field}}");{{end}}
			{{end}}
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}