using System;
using System.Collections.Generic;

/***
 * BusterKillTbl.cs
 * BusterKillCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class BusterKillTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 需要击杀怪物数量
		public int MonsterCount {get; set; }
		// 普通屠魔经验
		public int ExpRank1 {get; set; }
		// 优质屠魔经验
		public int ExpRank2 {get; set; }
		// 精良屠魔经验
		public int ExpRank3 {get; set; }
		// 传说屠魔经验
		public int ExpRank4 {get; set; }
		// 史诗屠魔经验
		public int ExpRank5 {get; set; }
		
	}
	
    public class BusterKillCfg
    {
		public const string FILENAME = "BusterKill";
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
				BusterKillTbl record = new BusterKillTbl();
				
				record.MonsterCount = table.GetInt(i, "MonsterCount");
				record.ExpRank1 = table.GetInt(i, "ExpRank1");
				record.ExpRank2 = table.GetInt(i, "ExpRank2");
				record.ExpRank3 = table.GetInt(i, "ExpRank3");
				record.ExpRank4 = table.GetInt(i, "ExpRank4");
				record.ExpRank5 = table.GetInt(i, "ExpRank5");
				
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