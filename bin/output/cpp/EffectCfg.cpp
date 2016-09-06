/***
 * EffectTbl.cpp
 * EffectCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct EffectTbl
    {
		// #主键
		public ﻿int Id;
		// 描述
		public string Desc;
		// 路径
		public string Path;
		// 制作人员
		public string Author;
		
	}
	
    public class EffectCfg
    {
		public const string FILENAME = "Effect";
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
				EffectTbl record = new EffectTbl();
				
				record.Desc = table.GetString(i, "Desc");
				record.Path = table.GetString(i, "Path");
				record.Author = table.GetString(i, "Author");
				
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