package com.sangamone;

import java.util.ArrayList;

public class Jail {

	public static void main(String[] args) {
		ArrayList<String>list1=new ArrayList<>();
		for(int i=0;i<10;i++) {
			list1.add("C");
		}
		System.out.println(list1);
	    
	    for(int i=0;i<10;i++) {
	    	list1.set(i, "O");	
	    }
	    System.out.println(list1);
	    
	    for(int i=1;i<10;i+=2){
	    	list1.set(i, "C");
	    }
	   System.out.println(list1); 
	
	   for(int i=2;i<10; i+=3) {
			if(list1.get(i).equals("O")){
				list1.set(i, "C");
			}
			else {
				list1.set(i, "O");
			}
		}
	   System.out.println(list1);
	   
	   for(int i=3;i<10;i+=4) {
		   if(list1.get(i).equals("O")) {
			   list1.set(i, "C");
		   }
		   else{
			   list1.set(i, "O");
		   }
		   
	   }
	   System.out.println(list1);
	}
	
}
