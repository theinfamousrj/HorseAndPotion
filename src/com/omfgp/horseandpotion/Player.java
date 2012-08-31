package com.omfgp.horseandpotion;

//mage thief warrior
//monk(t+w) paladin(m+w) alchemist(m+t)

public class Player 
{
	private String pName, pID;
	private int pLevel, pHealth;
	private PlayerClass pClass;
	
	public Player() { }
	
	public Player(String name) {
		this.pName = name;
	}
	
	//Getters and setters
	
	public void setName(String name) {
		this.pName = name;
	}
	
	public String getName() {
		return this.pName;
	}
	
	public void setID(String id) {
		this.pID = id;
	}
	
	public String getID() {
		return this.pID;
	}
	
	public void setLevel(int level) {
		this.pLevel = level;
	}
	
	public int getLevel() {
		return this.pLevel;
	}
	
	public void setHealth(int health) {
		this.pHealth = health;
	}
	
	public int getHealth() {
		return this.pHealth;
	}
	
	public void setPlayerClass(PlayerClass pClass) {
		this.pClass = pClass;
	}
	
	public PlayerClass getPlayerClass() {
		return this.pClass;
	}
}
