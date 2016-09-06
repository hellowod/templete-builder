package com.config;

import java.util.HashMap;

/***
 * WorldPrototypeTbl.java
 * WorldPrototypeCfg.java
 *
 * @Author: abaojin
 */
public class WorldPrototypeTbl
{
	// #主键(场景id)
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 场景配置数据id
	private int SenceId;
	
	public int getSenceId(){
		return SenceId
	}
	
	public void setSenceId(int SenceId){
		this.SenceId = SenceId
	}
	
	// 备注(场景名称)
	private string Name;
	
	public string getName(){
		return Name
	}
	
	public void setName(string Name){
		this.Name = Name
	}
	
	// 图片名称
	private string NameImg;
	
	public string getNameImg(){
		return NameImg
	}
	
	public void setNameImg(string NameImg){
		this.NameImg = NameImg
	}
	
	// 掉落次数
	private int DropCount;
	
	public int getDropCount(){
		return DropCount
	}
	
	public void setDropCount(int DropCount){
		this.DropCount = DropCount
	}
	
	// 掉落道具列表
	private string DropItemList;
	
	public string getDropItemList(){
		return DropItemList
	}
	
	public void setDropItemList(string DropItemList){
		this.DropItemList = DropItemList
	}
	
	// 掉落道具概率
	private string DropChanceList;
	
	public string getDropChanceList(){
		return DropChanceList
	}
	
	public void setDropChanceList(string DropChanceList){
		this.DropChanceList = DropChanceList
	}
	
	// 掉落数量列表
	private string DropCountList;
	
	public string getDropCountList(){
		return DropCountList
	}
	
	public void setDropCountList(string DropCountList){
		this.DropCountList = DropCountList
	}
	
	// 稀有度1装备掉落权重
	private int EquipmentRarity1Chance;
	
	public int getEquipmentRarity1Chance(){
		return EquipmentRarity1Chance
	}
	
	public void setEquipmentRarity1Chance(int EquipmentRarity1Chance){
		this.EquipmentRarity1Chance = EquipmentRarity1Chance
	}
	
	// 稀有度2装备掉落权重
	private int EquipmentRarity2Chance;
	
	public int getEquipmentRarity2Chance(){
		return EquipmentRarity2Chance
	}
	
	public void setEquipmentRarity2Chance(int EquipmentRarity2Chance){
		this.EquipmentRarity2Chance = EquipmentRarity2Chance
	}
	
	// 稀有度3装备掉落权重
	private int EquipmentRarity3Chance;
	
	public int getEquipmentRarity3Chance(){
		return EquipmentRarity3Chance
	}
	
	public void setEquipmentRarity3Chance(int EquipmentRarity3Chance){
		this.EquipmentRarity3Chance = EquipmentRarity3Chance
	}
	
	// 稀有度4装备掉落权重
	private int EquipmentRarity4Chance;
	
	public int getEquipmentRarity4Chance(){
		return EquipmentRarity4Chance
	}
	
	public void setEquipmentRarity4Chance(int EquipmentRarity4Chance){
		this.EquipmentRarity4Chance = EquipmentRarity4Chance
	}
	
	// 稀有度5装备掉落权重
	private int EquipmentRarity5Chance;
	
	public int getEquipmentRarity5Chance(){
		return EquipmentRarity5Chance
	}
	
	public void setEquipmentRarity5Chance(int EquipmentRarity5Chance){
		this.EquipmentRarity5Chance = EquipmentRarity5Chance
	}
	
	// 复活点x
	private float ReliveX;
	
	public float getReliveX(){
		return ReliveX
	}
	
	public void setReliveX(float ReliveX){
		this.ReliveX = ReliveX
	}
	
	// 复活点Z
	private float ReliveZ;
	
	public float getReliveZ(){
		return ReliveZ
	}
	
	public void setReliveZ(float ReliveZ){
		this.ReliveZ = ReliveZ
	}
	
	// 金色精英怪最大数量
	private int EliteGoldMax;
	
	public int getEliteGoldMax(){
		return EliteGoldMax
	}
	
	public void setEliteGoldMax(int EliteGoldMax){
		this.EliteGoldMax = EliteGoldMax
	}
	
	// 金色精英怪检测刷新时间间隔（分钟）
	private int EliteGoldRefreshTime;
	
	public int getEliteGoldRefreshTime(){
		return EliteGoldRefreshTime
	}
	
	public void setEliteGoldRefreshTime(int EliteGoldRefreshTime){
		this.EliteGoldRefreshTime = EliteGoldRefreshTime
	}
	
	// 蓝色精英怪最大数量
	private int EliteBlueMax;
	
	public int getEliteBlueMax(){
		return EliteBlueMax
	}
	
	public void setEliteBlueMax(int EliteBlueMax){
		this.EliteBlueMax = EliteBlueMax
	}
	
	// 蓝色精英怪检测刷新时间间隔（分钟）
	private int EliteBlueRefreshTime;
	
	public int getEliteBlueRefreshTime(){
		return EliteBlueRefreshTime
	}
	
	public void setEliteBlueRefreshTime(int EliteBlueRefreshTime){
		this.EliteBlueRefreshTime = EliteBlueRefreshTime
	}
	
	
}

public class WorldPrototypeCfg
{
	public const string FILENAME = "WorldPrototype";
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