package com.marcotte.week4step1;

public class Cube extends Point
{
	// attributes
	private short depth;

	public Cube()
	{
		// set the child attribute
		super();
		depth = 0;
	}

	public Cube(short x, short y, short depth)
	{
		super(x, y);
		// set the child attribute
		setDepth(depth);
	}
	
	// behaviors
	@Override
	public String toString()
	{
		return "Cube [depth=" + depth + ", x=" + x + ", y=" + y + "]";
	}

	// accessors and mutators
	public short getDepth()
	{
		return depth;
	}

	public void setDepth(short depth)
	{
		if(depth > 0)
			this.depth = depth;
		else
			this.depth = 0;
	}
	
	
	
	

}
