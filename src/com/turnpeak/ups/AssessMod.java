package com.turnpeak.ups;

public class AssessMod {
		private String name = "ajay";
		public int age = 28;
		protected long phnNo = 123456789;
		boolean ssn = true;
		public int marks1 = 35;
	    public int marks2 = 75;
		private int res;
		//protected int res;
		
    public void profile() {
    	System.out.println("name:" +name);
    	System.out.println("age:" +age);
    	System.out.println("phone number is:" +phnNo);
    	System.out.println("ssn:" +ssn);
    	
    } 
    
    private int add() {
    	
        int res = marks1+marks2;
    	System.out.println("total marks:" + res);
		return res;    	
    }
    
    protected double percen() {
    	double persent = (res/200)*100;
    	System.out.println("percentage:" + persent);
    	return persent;
    }
    
    boolean status() {
    	if(ssn == true) {
    	return false;
    	}
    	return true;
    }
    
}
