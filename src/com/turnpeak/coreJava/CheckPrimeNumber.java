package com.turnpeak.coreJava;

public class CheckPrimeNumber extends PrimeNumber
{

	public void CheckPrime()
	{

		//PrmeNumber pn = new PrmeNumber();
		// pn.isPrime(5);

		System.out.println("value of i" + kj);

		for (int i = 2; i <= 100; i++)
		{

			System.out.println(i + " is prime? : " + isPrime(i));

		}

		System.out.println(isPrime(17));
	}

	public static void main(final String[] args)
	{
		final CheckPrimeNumber cpn = new CheckPrimeNumber();
		cpn.CheckPrime();
	}
}
