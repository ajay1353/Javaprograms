package com.turnpeak.coreJava;
//program on access modifiers

public class AssessMod
{
	private final String name = "ajay";
	public int age = 28;
	protected long phnNo = 123456789;
	boolean ssn = true;
	public int marks1 = 35;
	public int marks2 = 75;
	private int res;
	//protected int res;

	public void profile()
	{
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("phone number is:" + phnNo);
		System.out.println("ssn:" + ssn);

	}

	private int add()
	{

		final int res = marks1 + marks2;
		System.out.println("total marks:" + res);
		return res;
	}

	protected double percen()
	{
		final double persent = (res / 200) * 100;
		System.out.println("percentage:" + persent);
		return persent;

	}

	boolean status()
	{
		if (ssn == true)
		{
			return false;
		}
		return true;
	}

	public static void main(final String[] args)
	{
		final AssessMod am2 = new AssessMod();
		am2.add();


	}

}
