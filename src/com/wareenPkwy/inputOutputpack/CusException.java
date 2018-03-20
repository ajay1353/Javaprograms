package com.wareenPkwy.inputOutputpack;

import java.util.Scanner;


public class CusException
{
	int a;
	int b;
	Scanner sc = null;

	public int add()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter a value");
		System.out.println("a is" + sc.nextInt());
		System.out.println("Enter sec value");
		System.out.println("b is" + sc.nextInt());
		final int c = a + b;
		System.out.println("sum is" + c);
		return c;

	}
}
