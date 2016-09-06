/***
 * SceneBoxTbl.cpp
 * SceneBoxCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct SceneBoxTbl
    {
		// #主键
		public ﻿int Id;
		// 备注
		public string Comment;
		// 宝箱品质
		public int Quality;
		// 名称
		public string Name;
		// 模型路径
		public string ModelPath;
		// 存在特效id（特效表）
		public int ExistEffect;
		// 打开特效id
		public int OpenEffect;
		
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