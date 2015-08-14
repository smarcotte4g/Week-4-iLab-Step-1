package com.marcotte.week4step1;

import javax.swing.JOptionPane;

public class Point
{
	// attributes
	protected short x;
	protected short y;
	
	// constructors
	public Point()
	{
		super();
		x = 0;
		y = 0;
	}

	public Point(short x, short y)
	{
		super();
		setX(x);
		setY(y);
	}

	// behaviors
	@Override
	public String toString()
	{
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	// accessors and mutators 
	public short getX()
	{
		return x;
	}

	public void setX(short x)
	{
		if(x > 0)
			this.x = x;
		else
			this.x = 0;
	}

	public short getY()
	{
		return y;
	}

	public void setY(short y)
	{
		if(y > 0)
			this.y = y;
		else
			this.y = 0;
	}
	
}
