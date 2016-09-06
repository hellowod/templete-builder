/***
 * IntensifyRuleTbl.cpp
 * IntensifyRuleCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct IntensifyRuleTbl
    {
		// #主键
		public ﻿int Id;
		// 装备当前强化等级
		public int Rank;
		// 所需道具列表
		public string ItemList;
		// 所需道具数量
		public string ItemCount;
		// 所需消耗金币数量
		public int Money;
		// 强化成功率
		public int SucChance;
		// 如果强化失败, 可能减少多少强化等级
		public string BackRank;
		// 保底成功次数, 如果填写了N, 则在失败N次之后的第N+1次必定成功
		public int Guarantee;
		
	}
	
    public class IntensifyRuleCfg
    {
		public const string FILENAME = "IntensifyRule";
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
				IntensifyRuleTbl record = new IntensifyRuleTbl();
				
				record.Rank = table.GetInt(i, "Rank");
				record.ItemList = table.GetString(i, "ItemList");
				record.ItemCount = table.GetString(i, "ItemCount");
				record.Money = table.GetInt(i, "Money");
				record.SucChance = table.GetInt(i, "SucChance");
				record.BackRank = table.GetString(i, "BackRank");
				record.Guarantee = table.GetInt(i, "Guarantee");
				
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