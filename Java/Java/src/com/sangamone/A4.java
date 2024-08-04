package com.sangamone;

import java.util.ArrayList;
import java.util.Random;

public class A4 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(); 
		Random rand1= new Random();
		
		for(int i=0; i<10; i++) {
			int num1=rand1.nextInt(300);
			list1.add(num1);
		}
		
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i)%2==0) {
				System.out.println("its even" + " "+ list1.get(i));
			
			}
			else {
				System.out.println("its odd  " + list1.get(i));
			}
			
		}
		
	
	} 

}
