package com.marcotte.week4step1;

public class InheritanceTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Point p1 = new Point((short)10, (short)20);
		Square s1 = new Square((short)20, (short)30, (short)10);
		Cube c1 = new Cube((short)50, (short)70, (short)10);
		
		System.out.println(p1.toString());
		System.out.println(s1.toString());
		System.out.println(c1.toString());
		
		// exit gracefully
		System.exit(0);

	}

}
