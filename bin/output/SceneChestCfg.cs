using System;
using System.Collections.Generic;

/***
 * SceneChestTbl.cs
 * SceneChestCfg.cs
 *
 * @Author: AutoCode
 */
namespace Config
{
	public class SceneChestTbl
    {
		// #主键
		public ﻿int Id {get; set; }
		// 宝箱品质
		public int Rank {get; set; }
		// 名称
		public string Name {get; set; }
		// 模型路径
		public string ModelPath {get; set; }
		// 存在特效id
		public int ExistEffect {get; set; }
		// 打开特效id
		public int OpenEffect {get; set; }
		// 打开时间
		public int OpenTime {get; set; }
		// 掉落道具列表
		public string DropItemList {get; set; }
		// 掉落道具概率
		public string DropChanceList {get; set; }
		// 掉落数量列表
		public string DropCountList {get; set; }
		// 掉落次数
		public int DropCount {get; set; }
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
		
	}
	
    public class SceneChestCfg
    {
		public const string FILENAME = "SceneChest";
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
				SceneChestTbl record = new SceneChestTbl();
				
				record.Rank = table.GetInt(i, "Rank");
				record.Name = table.GetString(i, "Name");
				record.ModelPath = table.GetString(i, "ModelPath");
				record.ExistEffect = table.GetInt(i, "ExistEffect");
				record.OpenEffect = table.GetInt(i, "OpenEffect");
				record.OpenTime = table.GetInt(i, "OpenTime");
				record.DropItemList = table.GetString(i, "DropItemList");
				record.DropChanceList = table.GetString(i, "DropChanceList");
				record.DropCountList = table.GetString(i, "DropCountList");
				record.DropCount = table.GetInt(i, "DropCount");
				record.EquipmentRarity1Chance = table.GetInt(i, "EquipmentRarity1Chance");
				record.EquipmentRarity2Chance = table.GetInt(i, "EquipmentRarity2Chance");
				record.EquipmentRarity3Chance = table.GetInt(i, "EquipmentRarity3Chance");
				record.EquipmentRarity4Chance = table.GetInt(i, "EquipmentRarity4Chance");
				record.EquipmentRarity5Chance = table.GetInt(i, "EquipmentRarity5Chance");
				
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