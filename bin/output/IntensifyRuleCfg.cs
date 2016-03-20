using System;
using System.Collections.Generic;

/***
 * IntensifyRuleTbl.cs
 * IntensifyRuleCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class IntensifyRuleTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 装备当前强化等级
		public int Rank {get; set; }
		// 所需道具列表
		public string ItemList {get; set; }
		// 所需道具数量
		public string ItemCount {get; set; }
		// 所需消耗金币数量
		public int Money {get; set; }
		// 强化成功率
		public int SucChance {get; set; }
		// 如果强化失败, 可能减少多少强化等级
		public string BackRank {get; set; }
		// 保底成功次数, 如果填写了N, 则在失败N次之后的第N+1次必定成功
		public int Guarantee {get; set; }
		
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