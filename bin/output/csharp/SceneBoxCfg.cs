using System;
using System.Collections.Generic;

/***
 * SceneBoxTbl.cs
 * SceneBoxCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class SceneBoxTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 备注
		public string Comment {get; set; }
		// 宝箱品质
		public int Quality {get; set; }
		// 名称
		public string Name {get; set; }
		// 模型路径
		public string ModelPath {get; set; }
		// 存在特效id（特效表）
		public int ExistEffect {get; set; }
		// 打开特效id
		public int OpenEffect {get; set; }
		
	}
	
    public class SceneBoxCfg
    {
		public const string FILENAME = "SceneBox";
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
				SceneBoxTbl record = new SceneBoxTbl();
				
				record.Comment = table.GetString(i, "Comment");
				record.Quality = table.GetInt(i, "Quality");
				record.Name = table.GetString(i, "Name");
				record.ModelPath = table.GetString(i, "ModelPath");
				record.ExistEffect = table.GetInt(i, "ExistEffect");
				record.OpenEffect = table.GetInt(i, "OpenEffect");
				
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