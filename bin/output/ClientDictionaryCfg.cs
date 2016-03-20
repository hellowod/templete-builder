using System;
using System.Collections.Generic;

/***
 * ClientDictionaryTbl.cs
 * ClientDictionaryCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class ClientDictionaryTbl
    {
		// #主键
		public ﻿string Key {get; set; }
		// 值
		public string DictionaryCH {get; set; }
		// 备注说明
		public string Des {get; set; }
		
	}
	
    public class ClientDictionaryCfg
    {
		public const string FILENAME = "ClientDictionary";
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
				ClientDictionaryTbl record = new ClientDictionaryTbl();
				
				record.DictionaryCH = table.GetString(i, "DictionaryCH");
				record.Des = table.GetString(i, "Des");
				
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