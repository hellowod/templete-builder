/***
 * CopyPrototypeTbl.cpp
 * CopyPrototypeCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct CopyPrototypeTbl
    {
		// #主键
		public ﻿int Id;
		// 程序不用的注释数据
		public string MarkDes;
		// 副本名称图片文字
		public string NameImg;
		// 副本界面背景图
		public string BgImg;
		// 解锁等级
		public int Unlocklevel;
		// 副本名称
		public string Name;
		// 副本描述
		public string Des;
		// 单人难度周次数限制
		public int SingleWeekCount;
		// 组队难度周次数限制
		public int TeamWeekCount;
		// 场景表场景id
		public int SceneID;
		// 前置副本ID
		public int PrepositionCopy;
		
	}
	
    public class CopyPrototypeCfg
    {
		public const string FILENAME = "CopyPrototype";
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
				CopyPrototypeTbl record = new CopyPrototypeTbl();
				
				record.MarkDes = table.GetString(i, "MarkDes");
				record.NameImg = table.GetString(i, "NameImg");
				record.BgImg = table.GetString(i, "BgImg");
				record.Unlocklevel = table.GetInt(i, "Unlocklevel");
				record.Name = table.GetString(i, "Name");
				record.Des = table.GetString(i, "Des");
				record.SingleWeekCount = table.GetInt(i, "SingleWeekCount");
				record.TeamWeekCount = table.GetInt(i, "TeamWeekCount");
				record.SceneID = table.GetInt(i, "SceneID");
				record.PrepositionCopy = table.GetInt(i, "PrepositionCopy");
				
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