using System;
using System.Collections.Generic;

/***
 * SceneTransferTbl.cs
 * SceneTransferCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class SceneTransferTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 传送点名称
		public string Name {get; set; }
		// 非程序用注释
		public string Des {get; set; }
		// 传送目标副本的id列表
		public string TargetList {get; set; }
		
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