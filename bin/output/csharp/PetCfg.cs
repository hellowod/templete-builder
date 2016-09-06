using System;
using System.Collections.Generic;

/***
 * PetTbl.cs
 * PetCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class PetTbl
    {
		// #ID主键, 关联道具表Id
		public ﻿int Id {get; set; }
		// 宠物头像图标
		public string Icon {get; set; }
		// 宠物模型
		public string Model {get; set; }
		// 宠物特效
		public string Effect {get; set; }
		// 普通攻击技能id
		public int AttackSkillId {get; set; }
		// 程序不用的注释
		public string Des {get; set; }
		// 伤害类型
		public int DamageType {get; set; }
		// 宠物战斗类型
		public int PetType {get; set; }
		// 宠物物种
		public int PetClass {get; set; }
		// 代数
		public int Generation {get; set; }
		// 捕捉等级
		public int CatchLevel {get; set; }
		// 天赋下限
		public int DowerMin {get; set; }
		// 天赋上限
		public int DowerMax {get; set; }
		// 悟性下限
		public int UnderstandMin {get; set; }
		// 悟性上限
		public int UnderstandMax {get; set; }
		// 可繁殖次数
		public int BreedMax {get; set; }
		// 力量
		public int Str {get; set; }
		// 升级力量加值
		public int StrLevelup {get; set; }
		// 智力
		public int Wit {get; set; }
		// 升级智力加值
		public int WitLevelup {get; set; }
		// 敏捷
		public int Dex {get; set; }
		// 升级敏捷加值
		public int DexLevelup {get; set; }
		// 体力
		public int Vit {get; set; }
		// 升级体力加值
		public int VitLevelup {get; set; }
		// 被捕捉状态特效
		public int CatchEffect {get; set; }
		
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