/***
 * GameConfigTbl.cpp
 * GameConfigCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct GameConfigTbl
    {
		// #主键
		public ﻿string Key;
		// 值
		public string Value;
		// 值类型(作为数据检查依据)
		public string ValueType;
		// 备注
		public string Remark;
		
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