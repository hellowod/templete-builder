package com.config;

import java.util.HashMap;

/***
 * IntensifyRuleTbl.java
 * IntensifyRuleCfg.java
 *
 * @Author: abaojin
 */
public class IntensifyRuleTbl {

	// #主键
	private ﻿int Id;
	// 装备当前强化等级
	private int Rank;
	// 所需道具列表
	private string ItemList;
	// 所需道具数量
	private string ItemCount;
	// 所需消耗金币数量
	private int Money;
	// 强化成功率
	private int SucChance;
	// 如果强化失败, 可能减少多少强化等级
	private string BackRank;
	// 保底成功次数, 如果填写了N, 则在失败N次之后的第N+1次必定成功
	private int Guarantee;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public int getRank(){
		return Rank
	}
	public void setRank(int Rank){
		this.Rank = Rank
	}
	
	public string getItemList(){
		return ItemList
	}
	public void setItemList(string ItemList){
		this.ItemList = ItemList
	}
	
	public string getItemCount(){
		return ItemCount
	}
	public void setItemCount(string ItemCount){
		this.ItemCount = ItemCount
	}
	
	public int getMoney(){
		return Money
	}
	public void setMoney(int Money){
		this.Money = Money
	}
	
	public int getSucChance(){
		return SucChance
	}
	public void setSucChance(int SucChance){
		this.SucChance = SucChance
	}
	
	public string getBackRank(){
		return BackRank
	}
	public void setBackRank(string BackRank){
		this.BackRank = BackRank
	}
	
	public int getGuarantee(){
		return Guarantee
	}
	public void setGuarantee(int Guarantee){
		this.Guarantee = Guarantee
	}
	
}

public class IntensifyRuleCfg {
	public const string FILENAME = "IntensifyRule";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			IntensifyRuleTbl record = new IntensifyRuleTbl();
			
			record.Rank = table.GetInt(i, "Rank");
			record.ItemList = table.GetString(i, "ItemList");
			record.ItemCount = table.GetString(i, "ItemCount");
			record.Money = table.GetInt(i, "Money");
			record.SucChance = table.GetInt(i, "SucChance");
			record.BackRank = table.GetString(i, "BackRank");
			record.Guarantee = table.GetInt(i, "Guarantee");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}