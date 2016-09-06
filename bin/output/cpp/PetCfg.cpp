/***
 * PetTbl.cpp
 * PetCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct PetTbl
    {
		// #ID主键, 关联道具表Id
		public ﻿int Id;
		// 宠物头像图标
		public string Icon;
		// 宠物模型
		public string Model;
		// 宠物特效
		public string Effect;
		// 普通攻击技能id
		public int AttackSkillId;
		// 程序不用的注释
		public string Des;
		// 伤害类型
		public int DamageType;
		// 宠物战斗类型
		public int PetType;
		// 宠物物种
		public int PetClass;
		// 代数
		public int Generation;
		// 捕捉等级
		public int CatchLevel;
		// 天赋下限
		public int DowerMin;
		// 天赋上限
		public int DowerMax;
		// 悟性下限
		public int UnderstandMin;
		// 悟性上限
		public int UnderstandMax;
		// 可繁殖次数
		public int BreedMax;
		// 力量
		public int Str;
		// 升级力量加值
		public int StrLevelup;
		// 智力
		public int Wit;
		// 升级智力加值
		public int WitLevelup;
		// 敏捷
		public int Dex;
		// 升级敏捷加值
		public int DexLevelup;
		// 体力
		public int Vit;
		// 升级体力加值
		public int VitLevelup;
		// 被捕捉状态特效
		public int CatchEffect;
		
	}
	
    public class PetCfg
    {
		public const string FILENAME = "Pet";
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
				PetTbl record = new PetTbl();
				
				record.Icon = table.GetString(i, "Icon");
				record.Model = table.GetString(i, "Model");
				record.Effect = table.GetString(i, "Effect");
				record.AttackSkillId = table.GetInt(i, "AttackSkillId");
				record.Des = table.GetString(i, "Des");
				record.DamageType = table.GetInt(i, "DamageType");
				record.PetType = table.GetInt(i, "PetType");
				record.PetClass = table.GetInt(i, "PetClass");
				record.Generation = table.GetInt(i, "Generation");
				record.CatchLevel = table.GetInt(i, "CatchLevel");
				record.DowerMin = table.GetInt(i, "DowerMin");
				record.DowerMax = table.GetInt(i, "DowerMax");
				record.UnderstandMin = table.GetInt(i, "UnderstandMin");
				record.UnderstandMax = table.GetInt(i, "UnderstandMax");
				record.BreedMax = table.GetInt(i, "BreedMax");
				record.Str = table.GetInt(i, "Str");
				record.StrLevelup = table.GetInt(i, "StrLevelup");
				record.Wit = table.GetInt(i, "Wit");
				record.WitLevelup = table.GetInt(i, "WitLevelup");
				record.Dex = table.GetInt(i, "Dex");
				record.DexLevelup = table.GetInt(i, "DexLevelup");
				record.Vit = table.GetInt(i, "Vit");
				record.VitLevelup = table.GetInt(i, "VitLevelup");
				record.CatchEffect = table.GetInt(i, "CatchEffect");
				
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