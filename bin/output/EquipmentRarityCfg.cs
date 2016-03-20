using System;
using System.Collections.Generic;

/***
 * EquipmentRarityTbl.cs
 * EquipmentRarityCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class EquipmentRarityTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 装备稀有度
		public int Rarity {get; set; }
		// 卓越附加属性数量下限
		public int RemarkableCountMin {get; set; }
		// 卓越附加属性数量上限
		public int RemarkableCountMax {get; set; }
		// 宝石槽数量下限
		public int GemSlotMin {get; set; }
		// 宝石槽数量上限
		public int GemSlotMax {get; set; }
		
	}
	
    public class EquipmentRarityCfg
    {
		public const string FILENAME = "EquipmentRarity";
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
				EquipmentRarityTbl record = new EquipmentRarityTbl();
				
				record.Rarity = table.GetInt(i, "Rarity");
				record.RemarkableCountMin = table.GetInt(i, "RemarkableCountMin");
				record.RemarkableCountMax = table.GetInt(i, "RemarkableCountMax");
				record.GemSlotMin = table.GetInt(i, "GemSlotMin");
				record.GemSlotMax = table.GetInt(i, "GemSlotMax");
				
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