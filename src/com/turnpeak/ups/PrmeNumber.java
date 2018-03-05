package com.turnpeak.ups;

public class PrmeNumber {
	
	public boolean isPrime(int x) {
		for(int i=2; i<= x/2; i++) {
			if(i==0||i==1) {
				return false;
			}
			else if(x % i == 0){
			return false;
		    }				
	}
		return true;
   }
	public static void main(String[] args) {
		AssessMod am1 = new AssessMod();
	    am1.percen();
	    am1.status();
	}
}
