/***
 * HaloTbl.cpp
 * HaloCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct HaloTbl
    {
		// #主键
		public ﻿int Id;
		// 带有光环的怪物名称尾部需要使用括号包含该文字内容
		public string NameSuffix;
		// 程序不需要使用的描述字段
		public string Des;
		// 光环效果类别1冰2火3毒4吸5移动加速
		public int Type;
		// 光环效果的数值, 表示万分之
		public int Value;
		// 光环范围(米)
		public int Range;
		// 大尺寸光环特效ID
		public int ResLarge;
		// 中尺寸光环特效ID
		public int ResMid;
		// 小尺寸光环特效ID
		public int ResSmall;
		
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