package com.marcotte.week4step1;

import javax.swing.JOptionPane;

public class Square extends Point
{
	// attributes
	private short sideLength;
	
	// constructors
	public Square()
	{
		// set the child attribute
		super();
		sideLength = 0;
	}

	public Square(short x, short y, short sideLength)
	{
		super(x, y);
		// set the child attribute
		setSideLength(sideLength);
	}
	
	// behaviors
	@Override
	public String toString()
	{
		return "Square [sideLength=" + sideLength + ", x=" + x + ", y=" + y
				+ "]";
	}

	// accessors and mutators
	public short getSideLength()
	{
		return sideLength;
	}

	public void setSideLength(short sideLength)
	{
		if(sideLength > 0)
			this.sideLength = sideLength;
		else
			this.sideLength = 0;
	}

}
