/***
 * SceneTransferTbl.cpp
 * SceneTransferCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct SceneTransferTbl
    {
		// #主键
		public ﻿int Id;
		// 传送点名称
		public string Name;
		// 非程序用注释
		public string Des;
		// 传送目标副本的id列表
		public string TargetList;
		
	}
	
    public class SceneTransferCfg
    {
		public const string FILENAME = "SceneTransfer";
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
				SceneTransferTbl record = new SceneTransferTbl();
				
				record.Name = table.GetString(i, "Name");
				record.Des = table.GetString(i, "Des");
				record.TargetList = table.GetString(i, "TargetList");
				
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