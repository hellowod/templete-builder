using System;
using System.Collections.Generic;

/***
 * GemConvertPrototypeTbl.cs
 * GemConvertPrototypeCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class GemConvertPrototypeTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 转换目标列表
		public string TargetList {get; set; }
		// 金币价格
		public int GoldPrice {get; set; }
		
	}
	
    public class GemConvertPrototypeCfg
    {
		public const string FILENAME = "GemConvertPrototype";
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
				GemConvertPrototypeTbl record = new GemConvertPrototypeTbl();
				
				record.TargetList = table.GetString(i, "TargetList");
				record.GoldPrice = table.GetInt(i, "GoldPrice");
				
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