package com.kaviya.java.may25k2023;

public class ReverseString {
	public static void main(String...a) {
		String word="outtuo";
		String reversed="";
		char letter;
		//for(int index=word.length()-1;index>=0;index--) {
		for(int index=0;index<word.length();index++) {
			letter=word.charAt(index);
			reversed=letter+reversed;//123456789
			//System.out.print(word.charAt(index));
		}
		System.out.println(reversed);
		
		if(word==(reversed)) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not a palindrome");
	}
	

}
