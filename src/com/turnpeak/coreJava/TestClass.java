package com.turnpeak.coreJava;

import com.turnpeak.coreJava.AssessMod;


public class TestClass
{


	public static void difference()
	{
		int res1;
		final AssessMod am = new AssessMod();
		res1 = am.marks2 - am.marks1;
		System.out.println("difference is:" + res1);
	}

	public static void main(final String[] args)
	{
		//TestKlass tk = new TestKlass();
		final AssessMod am2 = new AssessMod();
		TestClass.difference();
		am2.profile();

	}

}
