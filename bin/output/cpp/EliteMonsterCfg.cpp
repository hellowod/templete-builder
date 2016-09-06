/***
 * EliteMonsterTbl.cpp
 * EliteMonsterCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct EliteMonsterTbl
    {
		// #主键
		public ﻿int Id;
		// 类型
		public int Type;
		// 所属场景类型3副本，2世界
		public int SceneType;
		// 血量变化百分比
		public int HPup;
		// 攻击力提升万分比
		public int EliteAtk;
		// 附加名称字典
		public string EliteAtkName;
		// 精英的幸运一击概率加值
		public int EliteCrtChance;
		// 附加名称字典
		public string EliteCrtChanceName;
		// 精英是否免疫控制
		public int EliteImmuneRestrict;
		// 附加名称字典
		public string EliteImmuneRestrictName;
		// 精英血量上限提升万分比
		public int EliteHP;
		// 附加名称字典
		public string EliteHPName;
		// 精英物理防御增加百分比
		public int EliteDef;
		// 附加名称字典
		public string EliteDefName;
		// 精英魔法防御增加百分比
		public int EliteMdef;
		// 附加名称字典
		public string EliteMdefName;
		// 可选光环列表ID,光环作为怪物被动技能, 需要有模型附加的特效
		public string HaloList;
		// 流光材质路径
		public string MatRes;
		
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