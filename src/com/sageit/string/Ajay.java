package com.sageit.string;

public class Ajay
{
  public static void main(String[] args) {
	  Ajay a =new Ajay();
	  //Mammal m =new mammal();
	  Animal a1 = new Animal();
	  Mammal m1 = new Animal();
	  Dog d1 = new Dog();
	  Cat c1 = new Cat();
	  Cat c2 = (Cat) new Animal(); // downcasting
	  Animal a2 = new Cat(); // upcasting  
	  
	  c2.meow();
	  a2.eat();
	  a2.sleep();
	  a2.move();
	 
  }
}
