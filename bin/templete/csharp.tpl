using System;
using System.Collections.Generic;

/***
 * {{.Name}}Tbl.cs
 * {{.Name}}Cfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class {{.Name}}Tbl
    {
		{{range .Colums}}// {{.Comment}}
		public {{.Type}} {{.Field}} {get; set; }
		{{end}}
	}
	{{$StringType := "string"}}{{$IntType := "int"}}{{$ByteType := "byte"}}{{$FloatType := "float"}}
    public class {{.Name}}Cfg
    {
		public const string FILENAME = "{{.Name}}";
		public Dictionary<int, BaseTbl> Init()
		{
			Table table = TableLoad.LoadTbl(FILENAME);
			if(table == null)
			{
				return null;
			}
			var dict = new Dictionary<int, BaseTbl>();
			int count = table.records.Count;
			for(int i = 0; i < count; ++i)
			{
				{{.Name}}Tbl record = new {{.Name}}Tbl();
				{{range .Colums}}{{if eq .Type $StringType}}record.{{.Field}} = table.GetString(i, "{{.Field}}");{{end}}{{if eq .Type $IntType}}record.{{.Field}} = table.GetInt(i, "{{.Field}}");{{end}}{{if eq .Type $ByteType}}record.{{.Field}} = table.GetByte(i, "{{.Field}}");{{end}}{{if eq .Type $FloatType}}record.{{.Field}} = table.GetFloat(i, "{{.Field}}");{{end}}
				{{end}}
				if(!dict.ContainsKey(record.Id))
				{
					continue;
				}
				dict.Add(record.Id, record);
			}
			return dict;
		}	
	}
}