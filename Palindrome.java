package com.kaviya.java.may25k2023;

public class Palindrome {
	public static void main(String[] a) {
	
		String word="ram";
		String reversed="";
		//char letter;

		for(int index=0;index<word.length();index++) {
			//letter =word.charAt(index);
			reversed=word.charAt(index)+reversed;
		}

		System.out.print(reversed+"\n");
		if(word.equals(reversed)) 
			System.out.println("the given string is Palindrome: "+word);
			
			else 
				System.out.println("The given string is not Palindrome: "+word);
			
		}

	}


