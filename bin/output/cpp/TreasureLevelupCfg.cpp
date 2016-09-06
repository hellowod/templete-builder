/***
 * TreasureLevelupTbl.cpp
 * TreasureLevelupCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct TreasureLevelupTbl
    {
		// #主键
		public ﻿int Id;
		// 法宝装备等级下限
		public int EquipLevelMin;
		// 法宝装备等级上限
		public int EquipLevelMax;
		// 法宝等级
		public int Level;
		// 法宝升级所需经验
		public int Exp;
		
	}
	
    public class TreasureLevelupCfg
    {
		public const string FILENAME = "TreasureLevelup";
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
				TreasureLevelupTbl record = new TreasureLevelupTbl();
				
				record.EquipLevelMin = table.GetInt(i, "EquipLevelMin");
				record.EquipLevelMax = table.GetInt(i, "EquipLevelMax");
				record.Level = table.GetInt(i, "Level");
				record.Exp = table.GetInt(i, "Exp");
				
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