package com.turnpeak.ups;

import java.util.*;

public class PrintDuplicates 
{
  public static void main(String[] args) {
	  Duplicates dn = new DuplicateNumber();
	  DuplicateNumInArray dnia = new DuplicateCharsInString();
	  DuplicateCharsInString dnia1 = new DuplicateCharsInString();
	  
	  List<Integer> numbers = new ArrayList<Integer>();
     for(int i=1;i<30;i++){
         numbers.add(i);
     }
     //add duplicate number into the list
     numbers.add(22);
     
     
	  dn.getDuplicateNum(numbers);
	  dn.getDuplicateChar("ajay krishna Kothapalli");
	   //dn.getDuplicateArrayNum();
	   
	   dnia.sum(35, 35);
	   dnia.sub(35, 25);
	   dnia1.mul(2, 5);
	   dnia1.sub(5, 2);
  }
  
}
