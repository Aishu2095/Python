package com.sangamone;

import java.util.ArrayList;

public class Jail2 {

	public static void main(String[] args) {
		int count=100;
		ArrayList<String>list1=new ArrayList<>();
		ArrayList<Integer>lucky=new ArrayList<>();
		ArrayList<Integer>unlucky=new ArrayList<>();
		for(int i=0;i<count;i++) {
			list1.add("C");
		}
	    
	    for(int i=0;i<count;i++) {
	    	list1.set(i, "O");	
	    }
	    
	    for(int i=1;i<count;i+=2){
	    	list1.set(i, "C");
	    }
	   
	   for(int j=2;j<count;j++) {
		   
		   for(int i=j;i<count; i+=(j+1)) {
				if(list1.get(i).equals("O")){
					list1.set(i, "C");
				}
				else {
					list1.set(i, "O");
				}
			}	   
	   }
	   for(int i=0;i<count;i++) {
		   if(list1.get(i).equals("O")) {
			   lucky.add(i+1);
		   }
		   else {
			   unlucky.add(i+1);
		   }
	   }	
	   System.out.println("Lucky prisoners are: "+ lucky+"  are going to be released today");
	   System.out.println("Unlucky ones are: "+ unlucky+"  released after 4 weeks");
	   	}	
}
