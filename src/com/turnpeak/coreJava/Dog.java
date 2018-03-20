package com.turnpeak.coreJava;

public class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Gow gow!");
	}

	@Override
	public void eat()
	{
		System.out.println("Dog is eating...");
	}
}
