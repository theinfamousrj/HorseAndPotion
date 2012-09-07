package com.omfgp.horseandpotion;

public class Player extends Entity 
{
	
	private String pName;
	private int pLevel, pHealth, pStr, pInt, pDex, pLuck, pMana, pSpeed;
	private PlayerClass pClass;
	
	public Player() 
	{ 
		
	}
	
	public Player(String name) 
	{
		this.pName = name;
	}
	
	//Setters and getters:
	
	public void setName(String newName) 
	{
		this.pName = newName;
	}
	
	public String getName() 
	{
		return this.pName;
	}
	
	public void setLevel(int newLevel) 
	{
		this.pLevel = newLevel;
	}
	
	public int getLevel() 
	{
		return this.pLevel;
	}
	
	public void setHealth(int newHealth) 
	{
		//return this.pStr * (value)? ex: return this.pStr * 10;
		this.pHealth = newHealth;
	}
	
	public int getHealth() 
	{
		return this.pHealth;
	}
	
	public void setStr(int plStr)
	{
		this.pStr = plStr;
	}
	
	public int getStr()
	{
		return this.pStr;
	}
	
	public void setInt(int plInt)
	{
		this.pInt = plInt;
	}
	
	public int getInt()
	{
		return this.pInt;
	}
	
	public void setDex(int plDex)
	{
		//return this.pInt * (value)?
		this.pDex = plDex;
	}
	
	public int getDex()
	{
		return this.pDex;
	}
	
	public void setLuck(int plLuck)
	{
		//return this.pInt * (value)?
		this.pLuck = plLuck;
	}
	
	public int getLuck()
	{
		return this.pLuck;
	}
	
	public void setSpeed(int plSpeed)
	{
		//return this.pSpeed * (value)?
		this.pSpeed = plSpeed;
	}
	
	public int getSpeed()
	{
		return this.pSpeed;
	}
	
	public void setMana(int plMana)
	{
		//return this.pInt * (value)?
		this.pMana = plMana;
	}
	
	public int getMana()
	{
		return this.pMana;
	}
	
	public void setPlayerClass(PlayerClass pClass) 
	{
		this.pClass = pClass;
	}
	
	public PlayerClass getPlayerClass() 
	{
		return this.pClass;
	}
}
