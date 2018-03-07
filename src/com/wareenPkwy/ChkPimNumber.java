package com.wareenPkwy;

import com.turnpeak.ups.PrmeNumber;;

public class ChkPimNumber extends PrmeNumber {

	public void CheckPrim() {
	
		//PrmeNumber pn = new PrmeNumber();
		// pn.isPrime(5);
		
		System.out.println("value of i"+kj);
		
		for (int i = 2; i <= 100; i++) {
		
			System.out.println(i + " is prime? : " + isPrime(i));
		
		}
		
		System.out.println(isPrime(17));
	}

	public static void main(String[] args) {
		ChkPimNumber cpn = new ChkPimNumber();
		cpn.CheckPrim();
	}
}
