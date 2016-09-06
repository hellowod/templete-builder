/***
 * ItemPrototypeTbl.cpp
 * ItemPrototypeCfg.cpp
 *
 * @Author: abaojin
 */
namespace Config
{
	public struct ItemPrototypeTbl
    {
		// #主键
		public ﻿int Id;
		// 程序不用的注释
		public string MarkDes;
		// 类型枚举
		public int Type;
		// 对应背包中tab标签按钮
		public int ClientTabIndex;
		// 名称
		public string Name;
		// 图标
		public string Icon;
		// 模型文件
		public string DropModel;
		// 描述
		public string Des;
		// 稀有度等级
		public int Rank;
		// 是否可出售
		public int CanSell;
		// 出售价格
		public int SellPrice;
		// 是否会因被其他玩家击杀而掉落
		public int CanDropByKill;
		// 物品等级
		public int Level;
		// 在背包中堆叠数量上限
		public int MaxStack;
		
	}
	
    public class ItemPrototypeCfg
    {
		public const string FILENAME = "ItemPrototype";
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
				ItemPrototypeTbl record = new ItemPrototypeTbl();
				
				record.MarkDes = table.GetString(i, "MarkDes");
				record.Type = table.GetInt(i, "Type");
				record.ClientTabIndex = table.GetInt(i, "ClientTabIndex");
				record.Name = table.GetString(i, "Name");
				record.Icon = table.GetString(i, "Icon");
				record.DropModel = table.GetString(i, "DropModel");
				record.Des = table.GetString(i, "Des");
				record.Rank = table.GetInt(i, "Rank");
				record.CanSell = table.GetInt(i, "CanSell");
				record.SellPrice = table.GetInt(i, "SellPrice");
				record.CanDropByKill = table.GetInt(i, "CanDropByKill");
				record.Level = table.GetInt(i, "Level");
				record.MaxStack = table.GetInt(i, "MaxStack");
				
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