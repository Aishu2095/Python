package com.sangamone;

public class Tables3 {
	public static void printTables(int start, int end) {
		for(int j=start; j<end+1; j++) {
			for(int i=1; i<11; i++) {
				System.out.println(j + " * " + i + " = "+ j*i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		printTables(2,10);
		printTables(10,25);
		
		
		
		
		
		
		

	}

}
