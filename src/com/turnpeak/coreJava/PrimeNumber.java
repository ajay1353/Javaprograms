package com.turnpeak.coreJava;

public class PrimeNumber
{

	protected int kj = 10;


	public boolean isPrime(final int x)
	{
		for (int i = 2; i <= x / 2; i++)
		{
			if (i == 0 || i == 1)
			{
				return false;
			}
			else if (x % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(final String[] args)
	{
		final AssessMod am1 = new AssessMod();
		am1.percen();
		am1.status();
	}
}
