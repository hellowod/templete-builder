package com.config;

import java.util.HashMap;

/***
 * EliteMonsterTbl.java
 * EliteMonsterCfg.java
 *
 * @Author: abaojin
 */
public class EliteMonsterTbl
{
	// #主键
	private ﻿int Id;
	
	public ﻿int getId(){
		return Id
	}
	
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	// 类型
	private int Type;
	
	public int getType(){
		return Type
	}
	
	public void setType(int Type){
		this.Type = Type
	}
	
	// 所属场景类型3副本，2世界
	private int SceneType;
	
	public int getSceneType(){
		return SceneType
	}
	
	public void setSceneType(int SceneType){
		this.SceneType = SceneType
	}
	
	// 血量变化百分比
	private int HPup;
	
	public int getHPup(){
		return HPup
	}
	
	public void setHPup(int HPup){
		this.HPup = HPup
	}
	
	// 攻击力提升万分比
	private int EliteAtk;
	
	public int getEliteAtk(){
		return EliteAtk
	}
	
	public void setEliteAtk(int EliteAtk){
		this.EliteAtk = EliteAtk
	}
	
	// 附加名称字典
	private string EliteAtkName;
	
	public string getEliteAtkName(){
		return EliteAtkName
	}
	
	public void setEliteAtkName(string EliteAtkName){
		this.EliteAtkName = EliteAtkName
	}
	
	// 精英的幸运一击概率加值
	private int EliteCrtChance;
	
	public int getEliteCrtChance(){
		return EliteCrtChance
	}
	
	public void setEliteCrtChance(int EliteCrtChance){
		this.EliteCrtChance = EliteCrtChance
	}
	
	// 附加名称字典
	private string EliteCrtChanceName;
	
	public string getEliteCrtChanceName(){
		return EliteCrtChanceName
	}
	
	public void setEliteCrtChanceName(string EliteCrtChanceName){
		this.EliteCrtChanceName = EliteCrtChanceName
	}
	
	// 精英是否免疫控制
	private int EliteImmuneRestrict;
	
	public int getEliteImmuneRestrict(){
		return EliteImmuneRestrict
	}
	
	public void setEliteImmuneRestrict(int EliteImmuneRestrict){
		this.EliteImmuneRestrict = EliteImmuneRestrict
	}
	
	// 附加名称字典
	private string EliteImmuneRestrictName;
	
	public string getEliteImmuneRestrictName(){
		return EliteImmuneRestrictName
	}
	
	public void setEliteImmuneRestrictName(string EliteImmuneRestrictName){
		this.EliteImmuneRestrictName = EliteImmuneRestrictName
	}
	
	// 精英血量上限提升万分比
	private int EliteHP;
	
	public int getEliteHP(){
		return EliteHP
	}
	
	public void setEliteHP(int EliteHP){
		this.EliteHP = EliteHP
	}
	
	// 附加名称字典
	private string EliteHPName;
	
	public string getEliteHPName(){
		return EliteHPName
	}
	
	public void setEliteHPName(string EliteHPName){
		this.EliteHPName = EliteHPName
	}
	
	// 精英物理防御增加百分比
	private int EliteDef;
	
	public int getEliteDef(){
		return EliteDef
	}
	
	public void setEliteDef(int EliteDef){
		this.EliteDef = EliteDef
	}
	
	// 附加名称字典
	private string EliteDefName;
	
	public string getEliteDefName(){
		return EliteDefName
	}
	
	public void setEliteDefName(string EliteDefName){
		this.EliteDefName = EliteDefName
	}
	
	// 精英魔法防御增加百分比
	private int EliteMdef;
	
	public int getEliteMdef(){
		return EliteMdef
	}
	
	public void setEliteMdef(int EliteMdef){
		this.EliteMdef = EliteMdef
	}
	
	// 附加名称字典
	private string EliteMdefName;
	
	public string getEliteMdefName(){
		return EliteMdefName
	}
	
	public void setEliteMdefName(string EliteMdefName){
		this.EliteMdefName = EliteMdefName
	}
	
	// 可选光环列表ID,光环作为怪物被动技能, 需要有模型附加的特效
	private string HaloList;
	
	public string getHaloList(){
		return HaloList
	}
	
	public void setHaloList(string HaloList){
		this.HaloList = HaloList
	}
	
	// 流光材质路径
	private string MatRes;
	
	public string getMatRes(){
		return MatRes
	}
	
	public void setMatRes(string MatRes){
		this.MatRes = MatRes
	}
	
	
}

public class EliteMonsterCfg
{
	public const string FILENAME = "EliteMonster";
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