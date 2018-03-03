package com.wareenPkwy;
import com.turnpeak.ups.PrmeNumber;;

public class ChkPimNumber {
	public void CheckPrim() {
		PrmeNumber pn = new PrmeNumber();
		//pn.isPrime(5);
		for(int i = 2; i<= 100; i++) {
			System.out.println(i+" is prime? : "+pn.isPrime(i));
		}
		System.out.println(pn.isPrime(17));
	}
   public static void main(String[] args) {
	   ChkPimNumber cpn = new ChkPimNumber();
	   cpn.CheckPrim();
   }
}
