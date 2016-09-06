/***
 * CreateRoleTbl.cpp
 * CreateRoleCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct CreateRoleTbl
    {
		// #ID(也作为职业类型)
		public ﻿int JobType;
		// 职业名称
		public string Job;
		// 角色头像
		public string HeadIcon;
		// 角色描述
		public string Desc;
		// 角色模型
		public string Model;
		// 音效
		public int Sound;
		
	}
	
    public class CreateRoleCfg
    {
		public const string FILENAME = "CreateRole";
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
				CreateRoleTbl record = new CreateRoleTbl();
				
				record.Job = table.GetString(i, "Job");
				record.HeadIcon = table.GetString(i, "HeadIcon");
				record.Desc = table.GetString(i, "Desc");
				record.Model = table.GetString(i, "Model");
				record.Sound = table.GetInt(i, "Sound");
				
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