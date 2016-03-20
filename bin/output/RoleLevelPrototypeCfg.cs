using System;
using System.Collections.Generic;

/***
 * RoleLevelPrototypeTbl.cs
 * RoleLevelPrototypeCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class RoleLevelPrototypeTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 升级所需经验值(消耗式升级)
		public int LevelupExp {get; set; }
		// 当前等级精力上限
		public int ForceLimit {get; set; }
		// 攻击减伤系数
		public int ReduceArgument {get; set; }
		// 可携带宠物数量上限
		public int PetCarryLimit {get; set; }
		
	}
	
    public class RoleLevelPrototypeCfg
    {
		public const string FILENAME = "RoleLevelPrototype";
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
				RoleLevelPrototypeTbl record = new RoleLevelPrototypeTbl();
				
				record.LevelupExp = table.GetInt(i, "LevelupExp");
				record.ForceLimit = table.GetInt(i, "ForceLimit");
				record.ReduceArgument = table.GetInt(i, "ReduceArgument");
				record.PetCarryLimit = table.GetInt(i, "PetCarryLimit");
				
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