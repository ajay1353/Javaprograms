package com.wareenPkwy;

import com.turnpeak.ups.AssessMod;

public class TestKlass {
	
	
	public static void difference() {
		int res1;
		AssessMod am = new AssessMod();
		 res1 = am.marks2 - am.marks1;
		 System.out.println("difference is:" + res1);
	}
	public static void main(String[] args) {
		//TestKlass tk = new TestKlass();
		AssessMod am2 = new AssessMod();
		TestKlass.difference();
		am2.profile();
		
	}

}
