using System;
using System.Collections.Generic;

/***
 * GameConfigTbl.cs
 * GameConfigCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class GameConfigTbl
    {
		// #主键
		public ﻿string Key {get; set; }
		// 值
		public string Value {get; set; }
		// 值类型(作为数据检查依据)
		public string ValueType {get; set; }
		// 备注
		public string Remark {get; set; }
		
	}
	
    public class GameConfigCfg
    {
		public const string FILENAME = "GameConfig";
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
				GameConfigTbl record = new GameConfigTbl();
				
				record.Value = table.GetString(i, "Value");
				record.ValueType = table.GetString(i, "ValueType");
				record.Remark = table.GetString(i, "Remark");
				
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