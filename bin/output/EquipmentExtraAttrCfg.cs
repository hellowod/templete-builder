using System;
using System.Collections.Generic;

/***
 * EquipmentExtraAttrTbl.cs
 * EquipmentExtraAttrCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class EquipmentExtraAttrTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 职业
		public int Occupation {get; set; }
		// 装备等级下限
		public int LevelMin {get; set; }
		// 装备等级上限
		public int LevelMax {get; set; }
		// 属性枚举
		public int AttrIndex {get; set; }
		// 属性值下限
		public int ValueMin {get; set; }
		// 属性值上限
		public int ValueMax {get; set; }
		
	}
	
    public class EquipmentExtraAttrCfg
    {
		public const string FILENAME = "EquipmentExtraAttr";
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
				EquipmentExtraAttrTbl record = new EquipmentExtraAttrTbl();
				
				record.Occupation = table.GetInt(i, "Occupation");
				record.LevelMin = table.GetInt(i, "LevelMin");
				record.LevelMax = table.GetInt(i, "LevelMax");
				record.AttrIndex = table.GetInt(i, "AttrIndex");
				record.ValueMin = table.GetInt(i, "ValueMin");
				record.ValueMax = table.GetInt(i, "ValueMax");
				
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