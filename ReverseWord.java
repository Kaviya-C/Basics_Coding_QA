package com.kaviya.java.may25k2023;

public class ReverseWord {
	public static void main(String...args) {
		
		String word="avaJ ayivak";
		
		String reverse="";
		
		int length=word.length();
		
		for(int index=length-1;index>=0;index--) {
			reverse=reverse+word.charAt(index);
			
		}
		System.out.println(reverse);
		
	}
}