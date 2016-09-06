/***
 * RoleAttrSetTbl.cpp
 * RoleAttrSetCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct RoleAttrSetTbl
    {
		// #职业
		public ﻿int Id;
		// 每级力量加点
		public int StrSet;
		// 每级敏捷加点
		public int DexSet;
		// 每级智力加点
		public int WitSet;
		// 每级体力加点
		public int VItSet;
		
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