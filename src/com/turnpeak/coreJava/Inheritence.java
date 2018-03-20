package com.turnpeak.coreJava;

public class Inheritence
{
	public static void main(final String[] args)
	{
		// Ajay a =new Ajay();
		//Mammal m =new mammal();
		//Animal a1 = new Animal();
		//Interface m1 = new Animal();
		//Dog d1 = new Dog();
		//Cat c1 = new Cat();
		final Cat c2 = (Cat) new Animal(); // downcasting
		final Animal a2 = new Cat(); // upcasting  

		c2.meow();
		a2.eat();
		a2.sleep();
		a2.move();

	}
}
