package com.config;

import java.util.HashMap;

/***
 * ItemPrototypeTbl.java
 * ItemPrototypeCfg.java
 *
 * @Author: abaojin
 */
public class ItemPrototypeTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 程序不用的注释
	private string MarkDes;
	
	public string getMarkDes(){
		return MarkDes
	}
	
	public void setMarkDes(string MarkDes){
		this.MarkDes = MarkDes
	}
	
	// 类型枚举
	private int Type;
	
	public int getType(){
		return Type
	}
	
	public void setType(int Type){
		this.Type = Type
	}
	
	// 对应背包中tab标签按钮
	private int ClientTabIndex;
	
	public int getClientTabIndex(){
		return ClientTabIndex
	}
	
	public void setClientTabIndex(int ClientTabIndex){
		this.ClientTabIndex = ClientTabIndex
	}
	
	// 名称
	private string Name;
	
	public string getName(){
		return Name
	}
	
	public void setName(string Name){
		this.Name = Name
	}
	
	// 图标
	private string Icon;
	
	public string getIcon(){
		return Icon
	}
	
	public void setIcon(string Icon){
		this.Icon = Icon
	}
	
	// 模型文件
	private string DropModel;
	
	public string getDropModel(){
		return DropModel
	}
	
	public void setDropModel(string DropModel){
		this.DropModel = DropModel
	}
	
	// 描述
	private string Des;
	
	public string getDes(){
		return Des
	}
	
	public void setDes(string Des){
		this.Des = Des
	}
	
	// 稀有度等级
	private int Rank;
	
	public int getRank(){
		return Rank
	}
	
	public void setRank(int Rank){
		this.Rank = Rank
	}
	
	// 是否可出售
	private int CanSell;
	
	public int getCanSell(){
		return CanSell
	}
	
	public void setCanSell(int CanSell){
		this.CanSell = CanSell
	}
	
	// 出售价格
	private int SellPrice;
	
	public int getSellPrice(){
		return SellPrice
	}
	
	public void setSellPrice(int SellPrice){
		this.SellPrice = SellPrice
	}
	
	// 是否会因被其他玩家击杀而掉落
	private int CanDropByKill;
	
	public int getCanDropByKill(){
		return CanDropByKill
	}
	
	public void setCanDropByKill(int CanDropByKill){
		this.CanDropByKill = CanDropByKill
	}
	
	// 物品等级
	private int Level;
	
	public int getLevel(){
		return Level
	}
	
	public void setLevel(int Level){
		this.Level = Level
	}
	
	// 在背包中堆叠数量上限
	private int MaxStack;
	
	public int getMaxStack(){
		return MaxStack
	}
	
	public void setMaxStack(int MaxStack){
		this.MaxStack = MaxStack
	}
	
	
}

public class ItemPrototypeCfg
{
	public const string FILENAME = "ItemPrototype";
	public HashMap<int, BaseTbl> Init()
	{
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null)
		{
			return null;
		}
		var dict = new HashMap<int, BaseTbl>();
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