using System;
using System.Collections.Generic;

/***
 * PetLevelTbl.cs
 * PetLevelCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class PetLevelTbl
    {
		// #ID
		public ﻿int Id {get; set; }
		// 升级所需经验
		public int Exp {get; set; }
		
	}
	
    public class PetLevelCfg
    {
		public const string FILENAME = "PetLevel";
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
				PetLevelTbl record = new PetLevelTbl();
				
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