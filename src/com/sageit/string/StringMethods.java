package com.sageit.string;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class StringMethods
{
   private String name = "Ajay krishna Kothapalli";
   
   public void allStringMethods() {
   	System.out.println(name.isEmpty());
   	System.out.println(name.charAt(5));
   	System.out.println(name.substring(13, 22));
   	System.out.println(name.indexOf("krishna"));
   	//System.out.println(name.toCharArray());
   	System.out.println(name.replace('s', 'c'));
   	//System.out.println(name.split(name));
   	System.out.println(name.subSequence(12, 21));
   	System.out.println("ajay".toUpperCase());
   	System.out.println("AJAY".toLowerCase());
   	
   }   
   public static void main(String[] args) {
   	StringMethods sm = new StringMethods();
   	sm.allStringMethods();
   }
}
