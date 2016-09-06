/***
 * ClientDictionaryTbl.cpp
 * ClientDictionaryCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct ClientDictionaryTbl
    {
		// #主键
		public ﻿string Key;
		// 值
		public string DictionaryCH;
		// 备注说明
		public string Des;
		
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