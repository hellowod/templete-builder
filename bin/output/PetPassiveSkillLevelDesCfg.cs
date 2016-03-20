using System;
using System.Collections.Generic;

/***
 * PetPassiveSkillLevelDesTbl.cs
 * PetPassiveSkillLevelDesCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class PetPassiveSkillLevelDesTbl
    {
		// #索引id格式为被动技能表id+数字0+技能等级
		public ﻿int Id {get; set; }
		// 以备查询需要,技能id
		public int SkillId {get; set; }
		// 以备查询需要,技能等级
		public int SkillLevel {get; set; }
		// 该等级的技能描述文字
		public string Des {get; set; }
		
	}
	
    public class PetPassiveSkillLevelDesCfg
    {
		public const string FILENAME = "PetPassiveSkillLevelDes";
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
				PetPassiveSkillLevelDesTbl record = new PetPassiveSkillLevelDesTbl();
				
				record.SkillId = table.GetInt(i, "SkillId");
				record.SkillLevel = table.GetInt(i, "SkillLevel");
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