using System;
using System.Collections.Generic;

/***
 * TestTbl.cs
 * TestCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class TestTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 备注
		public string Remark {get; set; }
		// 测试数据ID（多个ID间以英文半角分号分隔，最后一个id不要加分号）
		public string Data {get; set; }
		
	}
	
    public class TestCfg
    {
		public const string FILENAME = "Test";
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
				TestTbl record = new TestTbl();
				
				record.Remark = table.GetString(i, "Remark");
				record.Data = table.GetString(i, "Data");
				
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