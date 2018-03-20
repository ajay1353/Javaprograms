package com.turnpeak.coreJava;

public class Constructor
{
	public static void main(final String[] args)
	{
		final FibonaciSeries fs = new FibonaciSeries(10);
		final FibonaciSeries fs1 = new FibonaciSeries();
		fs1.printFibonaciSeries(10);
		System.out.println("Constructor used");
		fs.printFibonaciNumbers();

	}
}
