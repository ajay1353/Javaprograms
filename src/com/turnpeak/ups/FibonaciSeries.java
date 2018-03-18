package com.turnpeak.ups;

//Program on Fibonaci series till a range using constructors and methods overloading 
 
public class FibonaciSeries {
	int z;
	//default constructor
	public FibonaciSeries() {
		
	}
	//parameterised constructor
	public FibonaciSeries(int z1) {
		this.z = z1;
	}
	int i = 0;
	int j = 1;
	int k;
	//method with the range as argument 
	public void printFibonaciSeries(int n) {
		System.out.println(i);
		System.out.println(j);
		do {
			 k=i+j;
			 i=j;
			 j=k;
			 if(k<n) {
			 System.out.println(k);
			 }
		}while(k<n);
	   
	}
	// method without argument 
	public void printFibonaciSeries() {
		System.out.println(i);
		System.out.println(j);
		do {
			//System.out.println("hi");
			 k=i+j;
			 i=j;
			 j=k;
			 if(k<z) {
			 System.out.println(k);
			 }
		}while(k<z);
	   
	}
	
	//
	public void printFibonaciNumbers() {
		System.out.println(i);
		System.out.println(j);
		
		 for(int t=2;t<z;++t)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  k=i+j;    
		  System.out.println(k);    
		  i=j;
		  j=k;    
		 }    
	}

}
