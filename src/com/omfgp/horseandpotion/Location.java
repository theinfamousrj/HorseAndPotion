package com.omfgp.horseandpotion;

public class Location 
{

	private int xLoc, yLoc, zLoc;
	
	public Location(int x, int y, int z) 
	{
		this.xLoc = x;
		this.yLoc = y;
		this.zLoc = z;
	}
	
	//Getters and setters:
	
	public int getX() 
	{
		return this.xLoc;
	}
	
	public void setX(int x)
	{
		this.xLoc = x;
	}
	
	public int getY() 
	{
		return this.yLoc;
	}
	
	public void setY(int y) 
	{
		this.yLoc = y;
	}
	public int getZ() 
	{
		return this.zLoc;
	}
	
	public void setZ(int z) 
	{
		this.zLoc = z;
	}
}
