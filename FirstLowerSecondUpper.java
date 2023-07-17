package com.kaviya.java.may25k2023;

public class FirstLowerSecondUpper {
	
	public static void main(String...a) {
	String s="hello kaviyaaa";
	int mid=s.length()/2;
	
	String lowerCase="";
	String upperCase="";
	
	for(int index=0;index<s.length();index++) {
		if(index<mid)
			lowerCase+=Character.toLowerCase(s.charAt(index));
		else
			upperCase+=Character.toUpperCase(s.charAt(index));
	}
	
	
	System.out.println(lowerCase+upperCase);
	}

}
