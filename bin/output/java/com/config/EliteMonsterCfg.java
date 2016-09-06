package com.config;

import java.util.HashMap;

/***
 * EliteMonsterTbl.java
 * EliteMonsterCfg.java
 *
 * @Author: abaojin
 */
public class EliteMonsterTbl {

	// #主键
	private ﻿int Id;
	// 类型
	private int Type;
	// 所属场景类型3副本，2世界
	private int SceneType;
	// 血量变化百分比
	private int HPup;
	// 攻击力提升万分比
	private int EliteAtk;
	// 附加名称字典
	private string EliteAtkName;
	// 精英的幸运一击概率加值
	private int EliteCrtChance;
	// 附加名称字典
	private string EliteCrtChanceName;
	// 精英是否免疫控制
	private int EliteImmuneRestrict;
	// 附加名称字典
	private string EliteImmuneRestrictName;
	// 精英血量上限提升万分比
	private int EliteHP;
	// 附加名称字典
	private string EliteHPName;
	// 精英物理防御增加百分比
	private int EliteDef;
	// 附加名称字典
	private string EliteDefName;
	// 精英魔法防御增加百分比
	private int EliteMdef;
	// 附加名称字典
	private string EliteMdefName;
	// 可选光环列表ID,光环作为怪物被动技能, 需要有模型附加的特效
	private string HaloList;
	// 流光材质路径
	private string MatRes;
	
	
	public ﻿int getId(){
		return Id
	}
	public void setId(﻿int Id){
		this.Id = Id
	}
	
	public int getType(){
		return Type
	}
	public void setType(int Type){
		this.Type = Type
	}
	
	public int getSceneType(){
		return SceneType
	}
	public void setSceneType(int SceneType){
		this.SceneType = SceneType
	}
	
	public int getHPup(){
		return HPup
	}
	public void setHPup(int HPup){
		this.HPup = HPup
	}
	
	public int getEliteAtk(){
		return EliteAtk
	}
	public void setEliteAtk(int EliteAtk){
		this.EliteAtk = EliteAtk
	}
	
	public string getEliteAtkName(){
		return EliteAtkName
	}
	public void setEliteAtkName(string EliteAtkName){
		this.EliteAtkName = EliteAtkName
	}
	
	public int getEliteCrtChance(){
		return EliteCrtChance
	}
	public void setEliteCrtChance(int EliteCrtChance){
		this.EliteCrtChance = EliteCrtChance
	}
	
	public string getEliteCrtChanceName(){
		return EliteCrtChanceName
	}
	public void setEliteCrtChanceName(string EliteCrtChanceName){
		this.EliteCrtChanceName = EliteCrtChanceName
	}
	
	public int getEliteImmuneRestrict(){
		return EliteImmuneRestrict
	}
	public void setEliteImmuneRestrict(int EliteImmuneRestrict){
		this.EliteImmuneRestrict = EliteImmuneRestrict
	}
	
	public string getEliteImmuneRestrictName(){
		return EliteImmuneRestrictName
	}
	public void setEliteImmuneRestrictName(string EliteImmuneRestrictName){
		this.EliteImmuneRestrictName = EliteImmuneRestrictName
	}
	
	public int getEliteHP(){
		return EliteHP
	}
	public void setEliteHP(int EliteHP){
		this.EliteHP = EliteHP
	}
	
	public string getEliteHPName(){
		return EliteHPName
	}
	public void setEliteHPName(string EliteHPName){
		this.EliteHPName = EliteHPName
	}
	
	public int getEliteDef(){
		return EliteDef
	}
	public void setEliteDef(int EliteDef){
		this.EliteDef = EliteDef
	}
	
	public string getEliteDefName(){
		return EliteDefName
	}
	public void setEliteDefName(string EliteDefName){
		this.EliteDefName = EliteDefName
	}
	
	public int getEliteMdef(){
		return EliteMdef
	}
	public void setEliteMdef(int EliteMdef){
		this.EliteMdef = EliteMdef
	}
	
	public string getEliteMdefName(){
		return EliteMdefName
	}
	public void setEliteMdefName(string EliteMdefName){
		this.EliteMdefName = EliteMdefName
	}
	
	public string getHaloList(){
		return HaloList
	}
	public void setHaloList(string HaloList){
		this.HaloList = HaloList
	}
	
	public string getMatRes(){
		return MatRes
	}
	public void setMatRes(string MatRes){
		this.MatRes = MatRes
	}
	
}

public class EliteMonsterCfg {
	public const string FILENAME = "EliteMonster";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
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
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}