using System;
using System.Collections.Generic;

/***
 * AudioTbl.cs
 * AudioCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class AudioTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 描述
		public string Desc {get; set; }
		// 路径
		public string Path {get; set; }
		// 音量
		public float Volumn {get; set; }
		// 2d和3d转换
		public float PanLevel {get; set; }
		// 是否循环（1循环0不循环）
		public int IsLoop {get; set; }
		// 延迟时间
		public float DelayTime {get; set; }
		// 保留时间
		public float LifeTime {get; set; }
		
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