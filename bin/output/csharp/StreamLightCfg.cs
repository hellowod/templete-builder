using System;
using System.Collections.Generic;

/***
 * StreamLightTbl.cs
 * StreamLightCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class StreamLightTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 描述
		public string Des {get; set; }
		// 材质球路径
		public string MaterialPath {get; set; }
		
	}
	
    public class StreamLightCfg
    {
		public const string FILENAME = "StreamLight";
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
				StreamLightTbl record = new StreamLightTbl();
				
				record.Des = table.GetString(i, "Des");
				record.MaterialPath = table.GetString(i, "MaterialPath");
				
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