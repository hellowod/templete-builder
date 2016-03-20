using System;
using System.Collections.Generic;

/***
 * SceneTbl.cs
 * SceneCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class SceneTbl
    {
		// #主键(场景id)
		public ﻿int Id {get; set; }
		// 备注(场景名称)
		public string Name {get; set; }
		// 场景类型
		public int SceneType {get; set; }
		// 场景文件路径
		public string Path {get; set; }
		// 进入场景时显示场景名称
		public string NameImage {get; set; }
		// 可行走区域
		public string SceneBlock {get; set; }
		// 场景元素初始化配置
		public string SceneElement {get; set; }
		// 主背景音ID
		public int MainSoundId {get; set; }
		// 野外北京音ID
		public int FieldSoundId {get; set; }
		// 该场景对应的地图是否允许PVP1可0不可
		public int IsPVP {get; set; }
		
	}
	
    public class SceneCfg
    {
		public const string FILENAME = "Scene";
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
				SceneTbl record = new SceneTbl();
				
				record.Name = table.GetString(i, "Name");
				record.SceneType = table.GetInt(i, "SceneType");
				record.Path = table.GetString(i, "Path");
				record.NameImage = table.GetString(i, "NameImage");
				record.SceneBlock = table.GetString(i, "SceneBlock");
				record.SceneElement = table.GetString(i, "SceneElement");
				record.MainSoundId = table.GetInt(i, "MainSoundId");
				record.FieldSoundId = table.GetInt(i, "FieldSoundId");
				record.IsPVP = table.GetInt(i, "IsPVP");
				
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