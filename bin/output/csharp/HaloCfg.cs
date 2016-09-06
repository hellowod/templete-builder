using System;
using System.Collections.Generic;

/***
 * HaloTbl.cs
 * HaloCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class HaloTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 带有光环的怪物名称尾部需要使用括号包含该文字内容
		public string NameSuffix {get; set; }
		// 程序不需要使用的描述字段
		public string Des {get; set; }
		// 光环效果类别1冰2火3毒4吸5移动加速
		public int Type {get; set; }
		// 光环效果的数值, 表示万分之
		public int Value {get; set; }
		// 光环范围(米)
		public int Range {get; set; }
		// 大尺寸光环特效ID
		public int ResLarge {get; set; }
		// 中尺寸光环特效ID
		public int ResMid {get; set; }
		// 小尺寸光环特效ID
		public int ResSmall {get; set; }
		
	}
	
    public class HaloCfg
    {
		public const string FILENAME = "Halo";
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
				HaloTbl record = new HaloTbl();
				
				record.NameSuffix = table.GetString(i, "NameSuffix");
				record.Des = table.GetString(i, "Des");
				record.Type = table.GetInt(i, "Type");
				record.Value = table.GetInt(i, "Value");
				record.Range = table.GetInt(i, "Range");
				record.ResLarge = table.GetInt(i, "ResLarge");
				record.ResMid = table.GetInt(i, "ResMid");
				record.ResSmall = table.GetInt(i, "ResSmall");
				
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