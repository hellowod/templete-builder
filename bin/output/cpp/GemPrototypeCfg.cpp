/***
 * GemPrototypeTbl.cpp
 * GemPrototypeCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct GemPrototypeTbl
    {
		// #主键
		public ﻿int Id;
		// 宝石类型
		public int GemType;
		// 宝石等级(1-10)
		public int GemRank;
		// 宝石属性值
		public string GemAttrList;
		// 宝石属性值
		public string GemAttrValueList;
		
	}
	
    public class GemPrototypeCfg
    {
		public const string FILENAME = "GemPrototype";
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
				GemPrototypeTbl record = new GemPrototypeTbl();
				
				record.GemType = table.GetInt(i, "GemType");
				record.GemRank = table.GetInt(i, "GemRank");
				record.GemAttrList = table.GetString(i, "GemAttrList");
				record.GemAttrValueList = table.GetString(i, "GemAttrValueList");
				
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