package com.turnpeak.coreJava;

public abstract class AbsMethod
{
	public abstract int sum(int a, int b);

	public int sub(final int c, final int d)
	{
		final int e = c - d;
		System.out.println(e);
		return e;
	}
}



