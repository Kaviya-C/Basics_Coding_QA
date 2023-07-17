package com.kaviya.java.may25k2023;

public class ReverseNumber {
	public static void main(String...a) {
		int number=1331;
		int original=number;
		int remainder=0;
		
		while(number>0) {
			remainder=remainder*10+number%10;
			number/=10;
		}
		System.out.println("Reversed Number: "+remainder);
		
		if(original==remainder)
		System.out.println("given number is Palindrom: "+original);
		else
			System.out.println("given number is not Palindrome: "+original);
	}

}
