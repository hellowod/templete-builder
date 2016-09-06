/***
 * MonsterDropWorldTbl.cpp
 * MonsterDropWorldCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct MonsterDropWorldTbl
    {
		// #id
		public ﻿int Id;
		// 怪物等级下限
		public int MonsterLevelMin;
		// 怪物等级上限
		public int MonsterLevelMax;
		// 掉落道具列表
		public string DropItemList;
		// 掉落道具概率万分比
		public string DropChanceList;
		// 掉落数量列表
		public string DropCountList;
		// 掉落次数
		public int DropCount;
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
	
    public class MonsterDropWorldCfg
    {
		public const string FILENAME = "MonsterDropWorld";
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
				MonsterDropWorldTbl record = new MonsterDropWorldTbl();
				
				record.MonsterLevelMin = table.GetInt(i, "MonsterLevelMin");
				record.MonsterLevelMax = table.GetInt(i, "MonsterLevelMax");
				record.DropItemList = table.GetString(i, "DropItemList");
				record.DropChanceList = table.GetString(i, "DropChanceList");
				record.DropCountList = table.GetString(i, "DropCountList");
				record.DropCount = table.GetInt(i, "DropCount");
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