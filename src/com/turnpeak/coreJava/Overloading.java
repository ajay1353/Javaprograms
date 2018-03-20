package com.turnpeak.coreJava;

public class Overloading
{
	public static void main(final String[] args)
	{
		final FibonaciSeries fs = new FibonaciSeries();
		final FibonaciSeries fs1 = new FibonaciSeries(1000);
		fs.printFibonaciSeries(1000);
		System.out.println("overloading method results");
		fs1.printFibonaciSeries();
	}

}
