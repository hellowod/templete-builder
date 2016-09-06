/***
 * SkillProfessionTbl.cpp
 * SkillProfessionCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct SkillProfessionTbl
    {
		// #主键
		public ﻿int Id;
		// 职业枚举说明
		public string Desc;
		// 职业枚举
		public int Profession;
		// 技能次序号,1为普攻技能,角色创建自带1级,默认装配在写死的一个技能装配位
		public int Index;
		// 默认技能id
		public int DefaultId;
		// 奥义1技能id
		public int Profound1;
		// 奥义1解锁等级
		public int Profound1UnlockLevel;
		// 奥义1所需道具id
		public int Profound1Item;
		// 奥义1所需道具数量
		public int Profound1ItemCount;
		// 奥义1是否与原技能共存
		public int Profound1Coexist;
		// 奥义2技能id
		public int Profound2;
		// 奥义2解锁等级
		public int Profound2UnlockLevel;
		// 奥义2所需道具id
		public int Profound2Item;
		// 奥义2所需道具数量
		public int Profound2ItemCount;
		// 奥义2是否与原技能共存
		public int Profound2Coexist;
		
	}
	
    public class SkillProfessionCfg
    {
		public const string FILENAME = "SkillProfession";
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
				SkillProfessionTbl record = new SkillProfessionTbl();
				
				record.Desc = table.GetString(i, "Desc");
				record.Profession = table.GetInt(i, "Profession");
				record.Index = table.GetInt(i, "Index");
				record.DefaultId = table.GetInt(i, "DefaultId");
				record.Profound1 = table.GetInt(i, "Profound1");
				record.Profound1UnlockLevel = table.GetInt(i, "Profound1UnlockLevel");
				record.Profound1Item = table.GetInt(i, "Profound1Item");
				record.Profound1ItemCount = table.GetInt(i, "Profound1ItemCount");
				record.Profound1Coexist = table.GetInt(i, "Profound1Coexist");
				record.Profound2 = table.GetInt(i, "Profound2");
				record.Profound2UnlockLevel = table.GetInt(i, "Profound2UnlockLevel");
				record.Profound2Item = table.GetInt(i, "Profound2Item");
				record.Profound2ItemCount = table.GetInt(i, "Profound2ItemCount");
				record.Profound2Coexist = table.GetInt(i, "Profound2Coexist");
				
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