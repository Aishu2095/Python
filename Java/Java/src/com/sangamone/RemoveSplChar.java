package com.sangamone;

import java.util.ArrayList;
import java.util.List;

public class RemoveSplChar {

	public static void main(String[] args) {
		String old = "H,o.w are you ? Oh my God, you are bleeding! Let us go to the doctor quickly.";
		String new1 = "";
		String char1="";
		System.out.println(old);
		List<String>list1 = new ArrayList<>();
		list1.add("!");
		list1.add("@");
		list1.add("#");
		list1.add("$");
		list1.add("%");
		list1.add("^");
		list1.add("&");
		list1.add("*");
		list1.add("(");
		list1.add(")");
		list1.add("-");
		list1.add(".");
		list1.add(",");
		list1.add("?");
		for(int i=0;i<list1.size();i++) {
			for(int j=0;j<old.length();j++) {
				char1=old.substring(j,j+1);
				if(char1.equals(list1.get(i))) {
					old=old.replace(char1,"");	
				}				
			}	
		}
		System.out.println(old);	
	}
}
