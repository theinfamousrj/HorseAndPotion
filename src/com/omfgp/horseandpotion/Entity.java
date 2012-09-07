package com.omfgp.horseandpotion;

import java.util.Vector;

public class Entity 
{

	private String eID;
	private Type eType;
	private Vector eVelocity;
	private Location eLocation;
	
	public Entity() 
	{
		
	}
	
	//Setters and getters:
	
	public void setID(String id) 
	{
		this.eID = id;
	}
	
	public String getID() 
	{
		return this.eID;
	}
	
	public void setType(Type newType) 
	{
		this.eType = newType;
	}
	
	public Type getType() 
	{
		return this.eType;
	}
	
	public void setVelocity(int newVX, int newVY) 
	{
		this.eVelocity = new Vector(newVX, newVY);
	}
	
}
