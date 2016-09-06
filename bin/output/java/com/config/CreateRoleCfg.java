package com.config;

import java.util.HashMap;

/***
 * CreateRoleTbl.java
 * CreateRoleCfg.java
 *
 * @Author: abaojin
 */
public class CreateRoleTbl {

	// #ID(也作为职业类型)
	private ﻿int JobType;
	// 职业名称
	private string Job;
	// 角色头像
	private string HeadIcon;
	// 角色描述
	private string Desc;
	// 角色模型
	private string Model;
	// 音效
	private int Sound;
	
	
	public ﻿int getJobType(){
		return JobType
	}
	public void setJobType(﻿int JobType){
		this.JobType = JobType
	}
	
	public string getJob(){
		return Job
	}
	public void setJob(string Job){
		this.Job = Job
	}
	
	public string getHeadIcon(){
		return HeadIcon
	}
	public void setHeadIcon(string HeadIcon){
		this.HeadIcon = HeadIcon
	}
	
	public string getDesc(){
		return Desc
	}
	public void setDesc(string Desc){
		this.Desc = Desc
	}
	
	public string getModel(){
		return Model
	}
	public void setModel(string Model){
		this.Model = Model
	}
	
	public int getSound(){
		return Sound
	}
	public void setSound(int Sound){
		this.Sound = Sound
	}
	
}

public class CreateRoleCfg {
	public const string FILENAME = "CreateRole";
	public HashMap<int, BaseTbl> Init() {
		Table table = TableLoad.LoadTbl(FILENAME);
		if(table == null) {
			return null;
		}
		HashMap<int, BaseTbl> map = new HashMap<int, BaseTbl>();
		int count = table.records.Count;
		for(int i = 0; i < count; ++i) {
			CreateRoleTbl record = new CreateRoleTbl();
			
			record.Job = table.GetString(i, "Job");
			record.HeadIcon = table.GetString(i, "HeadIcon");
			record.Desc = table.GetString(i, "Desc");
			record.Model = table.GetString(i, "Model");
			record.Sound = table.GetInt(i, "Sound");
			
			if(!map.ContainsKey(record.Id)) {
				continue;
			}
			map.Add(record.Id, record);
		}
		return map;
	}	
}