/***
 * AudioTbl.cpp
 * AudioCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct AudioTbl
    {
		// #主键
		public ﻿int Id;
		// 描述
		public string Desc;
		// 路径
		public string Path;
		// 音量
		public float Volumn;
		// 2d和3d转换
		public float PanLevel;
		// 是否循环（1循环0不循环）
		public int IsLoop;
		// 延迟时间
		public float DelayTime;
		// 保留时间
		public float LifeTime;
		
	}
	
    public class AudioCfg
    {
		public const string FILENAME = "Audio";
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
				AudioTbl record = new AudioTbl();
				
				record.Desc = table.GetString(i, "Desc");
				record.Path = table.GetString(i, "Path");
				record.Volumn = table.GetFloat(i, "Volumn");
				record.PanLevel = table.GetFloat(i, "PanLevel");
				record.IsLoop = table.GetInt(i, "IsLoop");
				record.DelayTime = table.GetFloat(i, "DelayTime");
				record.LifeTime = table.GetFloat(i, "LifeTime");
				
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