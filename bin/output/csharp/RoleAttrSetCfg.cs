using System;
using System.Collections.Generic;

/***
 * RoleAttrSetTbl.cs
 * RoleAttrSetCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class RoleAttrSetTbl
    {
		// #职业
		public ﻿int Id {get; set; }
		// 每级力量加点
		public int StrSet {get; set; }
		// 每级敏捷加点
		public int DexSet {get; set; }
		// 每级智力加点
		public int WitSet {get; set; }
		// 每级体力加点
		public int VItSet {get; set; }
		
	}
	
    public class RoleAttrSetCfg
    {
		public const string FILENAME = "RoleAttrSet";
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
				RoleAttrSetTbl record = new RoleAttrSetTbl();
				
				record.StrSet = table.GetInt(i, "StrSet");
				record.DexSet = table.GetInt(i, "DexSet");
				record.WitSet = table.GetInt(i, "WitSet");
				record.VItSet = table.GetInt(i, "VItSet");
				
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