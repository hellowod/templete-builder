using System;
using System.Collections.Generic;

/***
 * EffectTbl.cs
 * EffectCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class EffectTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 描述
		public string Desc {get; set; }
		// 路径
		public string Path {get; set; }
		// 制作人员
		public string Author {get; set; }
		
	}
	
    public class EffectCfg
    {
		public const string FILENAME = "Effect";
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
				EffectTbl record = new EffectTbl();
				
				record.Desc = table.GetString(i, "Desc");
				record.Path = table.GetString(i, "Path");
				record.Author = table.GetString(i, "Author");
				
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