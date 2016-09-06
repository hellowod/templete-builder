/***
 * EquipmentExtraAttrTbl.cpp
 * EquipmentExtraAttrCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct EquipmentExtraAttrTbl
    {
		// #主键
		public ﻿int Id;
		// 职业
		public int Occupation;
		// 装备等级下限
		public int LevelMin;
		// 装备等级上限
		public int LevelMax;
		// 属性枚举
		public int AttrIndex;
		// 属性值下限
		public int ValueMin;
		// 属性值上限
		public int ValueMax;
		
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