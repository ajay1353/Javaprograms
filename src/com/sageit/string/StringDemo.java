package com.sageit.string;

public class StringDemo
{
	String s = new String("Rohith");
	String s1 = new String("Rohith");

	/*
	 * public boolean compare() { if (s.equals(s1)) { System.out.println("true value"); } else {
	 * System.out.println("false"); } return true; }
	 */
	public static void main(final String[] args)
	{
		final StringDemo sd = new StringDemo();
		final String s3 = new String("Rohith");
		System.out.println(s3.compareTo("Aay"));
		//sd.compare();

	}
}
