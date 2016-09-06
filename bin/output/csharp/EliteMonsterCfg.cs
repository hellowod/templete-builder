using System;
using System.Collections.Generic;

/***
 * EliteMonsterTbl.cs
 * EliteMonsterCfg.cs
 *
 * @Author: abaojin
 */
namespace Config
{
	public class EliteMonsterTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 类型
		public int Type {get; set; }
		// 所属场景类型3副本，2世界
		public int SceneType {get; set; }
		// 血量变化百分比
		public int HPup {get; set; }
		// 攻击力提升万分比
		public int EliteAtk {get; set; }
		// 附加名称字典
		public string EliteAtkName {get; set; }
		// 精英的幸运一击概率加值
		public int EliteCrtChance {get; set; }
		// 附加名称字典
		public string EliteCrtChanceName {get; set; }
		// 精英是否免疫控制
		public int EliteImmuneRestrict {get; set; }
		// 附加名称字典
		public string EliteImmuneRestrictName {get; set; }
		// 精英血量上限提升万分比
		public int EliteHP {get; set; }
		// 附加名称字典
		public string EliteHPName {get; set; }
		// 精英物理防御增加百分比
		public int EliteDef {get; set; }
		// 附加名称字典
		public string EliteDefName {get; set; }
		// 精英魔法防御增加百分比
		public int EliteMdef {get; set; }
		// 附加名称字典
		public string EliteMdefName {get; set; }
		// 可选光环列表ID,光环作为怪物被动技能, 需要有模型附加的特效
		public string HaloList {get; set; }
		// 流光材质路径
		public string MatRes {get; set; }
		
	}
	
    public class EliteMonsterCfg
    {
		public const string FILENAME = "EliteMonster";
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
				EliteMonsterTbl record = new EliteMonsterTbl();
				
				record.Type = table.GetInt(i, "Type");
				record.SceneType = table.GetInt(i, "SceneType");
				record.HPup = table.GetInt(i, "HPup");
				record.EliteAtk = table.GetInt(i, "EliteAtk");
				record.EliteAtkName = table.GetString(i, "EliteAtkName");
				record.EliteCrtChance = table.GetInt(i, "EliteCrtChance");
				record.EliteCrtChanceName = table.GetString(i, "EliteCrtChanceName");
				record.EliteImmuneRestrict = table.GetInt(i, "EliteImmuneRestrict");
				record.EliteImmuneRestrictName = table.GetString(i, "EliteImmuneRestrictName");
				record.EliteHP = table.GetInt(i, "EliteHP");
				record.EliteHPName = table.GetString(i, "EliteHPName");
				record.EliteDef = table.GetInt(i, "EliteDef");
				record.EliteDefName = table.GetString(i, "EliteDefName");
				record.EliteMdef = table.GetInt(i, "EliteMdef");
				record.EliteMdefName = table.GetString(i, "EliteMdefName");
				record.HaloList = table.GetString(i, "HaloList");
				record.MatRes = table.GetString(i, "MatRes");
				
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