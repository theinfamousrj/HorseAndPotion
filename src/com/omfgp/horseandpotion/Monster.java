package com.omfgp.horseandpotion;

public class Monster 
{
	
	private String mName, mClass;
	private int mLevel, mHealth;
	
	public Monster() { }
	
	public Monster(String monsterName) 
	{
		this.mName = monsterName;
	}
	
	public void setMName(String monsterName)
	{
		this.mName = monsterName;
	}
	
	public String getMName()
	{
		return this.mName;
	}
	
	public void setMClass(String monsterClass)
	{
		this.mClass = monsterClass;
	}
	
	public String getMClass()
	{
		return this.mClass;
	}
	
	public void setMLevel(int monsterLevel)
	{
		this.mLevel = monsterLevel;
	}
	
	public int getMLevel()
	{
		return this.mLevel;
	}
	
	public void setMHealth(int monsterHealth)
	{
		this.mHealth = monsterHealth;
	}
	
	public int getMHealth()
	{
		return this.mHealth;
	}
	
}
