using System;
using System.Collections.Generic;

/***
 * VersionGiftTbl.cs
 * VersionGiftCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class VersionGiftTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 道具id列表
		public string ItemList {get; set; }
		// 道具数量列表
		public string ItemCount {get; set; }
		// 道具绑定状态列表
		public string ItemBound {get; set; }
		// 获取的装备类道具的已鉴定概率万分之
		public int EquipCheckChance {get; set; }
		// 稀有度1装备掉落权重
		public int EquipmentRarity1Chance {get; set; }
		// 稀有度2装备掉落权重
		public int EquipmentRarity2Chance {get; set; }
		// 稀有度3装备掉落权重
		public int EquipmentRarity3Chance {get; set; }
		// 稀有度4装备掉落权重
		public int EquipmentRarity4Chance {get; set; }
		// 稀有度5装备掉落权重
		public int EquipmentRarity5Chance {get; set; }
		
	}
	
    public class VersionGiftCfg
    {
		public const string FILENAME = "VersionGift";
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
				VersionGiftTbl record = new VersionGiftTbl();
				
				record.ItemList = table.GetString(i, "ItemList");
				record.ItemCount = table.GetString(i, "ItemCount");
				record.ItemBound = table.GetString(i, "ItemBound");
				record.EquipCheckChance = table.GetInt(i, "EquipCheckChance");
				record.EquipmentRarity1Chance = table.GetInt(i, "EquipmentRarity1Chance");
				record.EquipmentRarity2Chance = table.GetInt(i, "EquipmentRarity2Chance");
				record.EquipmentRarity3Chance = table.GetInt(i, "EquipmentRarity3Chance");
				record.EquipmentRarity4Chance = table.GetInt(i, "EquipmentRarity4Chance");
				record.EquipmentRarity5Chance = table.GetInt(i, "EquipmentRarity5Chance");
				
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