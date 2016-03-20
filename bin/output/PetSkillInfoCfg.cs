using System;
using System.Collections.Generic;

/***
 * PetSkillInfoTbl.cs
 * PetSkillInfoCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class PetSkillInfoTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 技能ID
		public int SkillId {get; set; }
		// 1主动2被动
		public int SkillType {get; set; }
		// 技能是否可领悟,1是0否
		public int IsAutoGet {get; set; }
		// 技能领悟权重, 某个技能的领悟概率 = 该技能领悟权重/所有其他可领悟技能权重之和
		public int AutoGetWeight {get; set; }
		// 学习1级该技能所需道具id, 0表示不能通过道具学习
		public int LearnItem1 {get; set; }
		// 学习2级该技能所需道具id, 0表示不能通过道具学习
		public int LearnItem2 {get; set; }
		// 学习3级该技能所需道具id, 0表示不能通过道具学习
		public int LearnItem3 {get; set; }
		
	}
	
    public class PetSkillInfoCfg
    {
		public const string FILENAME = "PetSkillInfo";
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
				PetSkillInfoTbl record = new PetSkillInfoTbl();
				
				record.SkillId = table.GetInt(i, "SkillId");
				record.SkillType = table.GetInt(i, "SkillType");
				record.IsAutoGet = table.GetInt(i, "IsAutoGet");
				record.AutoGetWeight = table.GetInt(i, "AutoGetWeight");
				record.LearnItem1 = table.GetInt(i, "LearnItem1");
				record.LearnItem2 = table.GetInt(i, "LearnItem2");
				record.LearnItem3 = table.GetInt(i, "LearnItem3");
				
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