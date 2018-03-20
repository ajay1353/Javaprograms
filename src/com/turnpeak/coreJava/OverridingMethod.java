package com.turnpeak.coreJava;

public class OverridingMethod
{

	public static void main(final String[] args)
	{
		final Animal a4 = new Dog();
		final Animal a5 = new Animal();
		a4.eat();
		a5.eat();
	}
}
