using System;
using System.Collections.Generic;

/***
 * WorldFarmExpLimitTbl.cs
 * WorldFarmExpLimitCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class WorldFarmExpLimitTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 100%经验条件值
		public int ExpStep1 {get; set; }
		// 50%经验条件值
		public int ExpStep2 {get; set; }
		// 25%经验条件值
		public int ExpStep3 {get; set; }
		
	}
	
    public class WorldFarmExpLimitCfg
    {
		public const string FILENAME = "WorldFarmExpLimit";
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
				WorldFarmExpLimitTbl record = new WorldFarmExpLimitTbl();
				
				record.ExpStep1 = table.GetInt(i, "ExpStep1");
				record.ExpStep2 = table.GetInt(i, "ExpStep2");
				record.ExpStep3 = table.GetInt(i, "ExpStep3");
				
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