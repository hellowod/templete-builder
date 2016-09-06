/***
 * EquipmentRarityTbl.cpp
 * EquipmentRarityCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct EquipmentRarityTbl
    {
		// #主键
		public ﻿int Id;
		// 装备稀有度
		public int Rarity;
		// 卓越附加属性数量下限
		public int RemarkableCountMin;
		// 卓越附加属性数量上限
		public int RemarkableCountMax;
		// 宝石槽数量下限
		public int GemSlotMin;
		// 宝石槽数量上限
		public int GemSlotMax;
		
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