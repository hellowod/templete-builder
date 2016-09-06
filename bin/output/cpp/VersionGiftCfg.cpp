/***
 * VersionGiftTbl.cpp
 * VersionGiftCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct VersionGiftTbl
    {
		// #主键
		public ﻿int Id;
		// 道具id列表
		public string ItemList;
		// 道具数量列表
		public string ItemCount;
		// 道具绑定状态列表
		public string ItemBound;
		// 获取的装备类道具的已鉴定概率万分之
		public int EquipCheckChance;
		// 稀有度1装备掉落权重
		public int EquipmentRarity1Chance;
		// 稀有度2装备掉落权重
		public int EquipmentRarity2Chance;
		// 稀有度3装备掉落权重
		public int EquipmentRarity3Chance;
		// 稀有度4装备掉落权重
		public int EquipmentRarity4Chance;
		// 稀有度5装备掉落权重
		public int EquipmentRarity5Chance;
		
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