package com.turnpeak.ups;

public class FibonaciSeries {
	int z;
	public FibonaciSeries() {
		
	}
	public FibonaciSeries(int z1) {
		this.z = z1;
	}
	int i = 0;
	int j = 1;
	int k;
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

}
