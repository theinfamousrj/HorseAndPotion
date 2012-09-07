package com.omfgp.horseandpotion;

public class Player extends Entity 
{
	
	private String pName;
	private int pLevel, pHealth;
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
		this.pHealth = newHealth;
	}
	
	public int getHealth() 
	{
		return this.pHealth;
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
