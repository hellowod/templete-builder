using System;
using System.Collections.Generic;

/***
 * WorldPrototypeTbl.cs
 * WorldPrototypeCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class WorldPrototypeTbl
    {
		// #主键(场景id)
		public ﻿int Id {get; set; }
		// 场景配置数据id
		public int SenceId {get; set; }
		// 备注(场景名称)
		public string Name {get; set; }
		// 图片名称
		public string NameImg {get; set; }
		// 掉落次数
		public int DropCount {get; set; }
		// 掉落道具列表
		public string DropItemList {get; set; }
		// 掉落道具概率
		public string DropChanceList {get; set; }
		// 掉落数量列表
		public string DropCountList {get; set; }
		// 稀有度1装备掉落权重
		public int EquipmentRarity1Chance {get; set; }
		// 稀有度2装备掉落权重
		public int EquipmentRarity2Chance {get; set; }
		// 稀有度3装备掉落权重
		public int EquipmentRarity3Chance {get; set; }
		// 稀有度4装备掉落权重
		public int EquipmentRarity4Chance {get; set; }
		// 稀有度5装备掉落权重
		public int EquipmentRarity5Chance {get; set; }
		// 复活点x
		public float ReliveX {get; set; }
		// 复活点Z
		public float ReliveZ {get; set; }
		// 金色精英怪最大数量
		public int EliteGoldMax {get; set; }
		// 金色精英怪检测刷新时间间隔（分钟）
		public int EliteGoldRefreshTime {get; set; }
		// 蓝色精英怪最大数量
		public int EliteBlueMax {get; set; }
		// 蓝色精英怪检测刷新时间间隔（分钟）
		public int EliteBlueRefreshTime {get; set; }
		
	}
	
    public class WorldPrototypeCfg
    {
		public const string FILENAME = "WorldPrototype";
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
				WorldPrototypeTbl record = new WorldPrototypeTbl();
				
				record.SenceId = table.GetInt(i, "SenceId");
				record.Name = table.GetString(i, "Name");
				record.NameImg = table.GetString(i, "NameImg");
				record.DropCount = table.GetInt(i, "DropCount");
				record.DropItemList = table.GetString(i, "DropItemList");
				record.DropChanceList = table.GetString(i, "DropChanceList");
				record.DropCountList = table.GetString(i, "DropCountList");
				record.EquipmentRarity1Chance = table.GetInt(i, "EquipmentRarity1Chance");
				record.EquipmentRarity2Chance = table.GetInt(i, "EquipmentRarity2Chance");
				record.EquipmentRarity3Chance = table.GetInt(i, "EquipmentRarity3Chance");
				record.EquipmentRarity4Chance = table.GetInt(i, "EquipmentRarity4Chance");
				record.EquipmentRarity5Chance = table.GetInt(i, "EquipmentRarity5Chance");
				record.ReliveX = table.GetFloat(i, "ReliveX");
				record.ReliveZ = table.GetFloat(i, "ReliveZ");
				record.EliteGoldMax = table.GetInt(i, "EliteGoldMax");
				record.EliteGoldRefreshTime = table.GetInt(i, "EliteGoldRefreshTime");
				record.EliteBlueMax = table.GetInt(i, "EliteBlueMax");
				record.EliteBlueRefreshTime = table.GetInt(i, "EliteBlueRefreshTime");
				
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