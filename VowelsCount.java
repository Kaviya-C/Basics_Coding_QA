package com.kaviya.java.may25k2023;

import java.util.Scanner;

public class VowelsCount {
	public static void main(String...a) {
		
		String word="yshv";
		int count=0;int countOfA=0;int countOfE=0;
		char[] character=word.toCharArray();
		
		for(char c:character) {
			switch(c) {
			case'a':
				count++;
				countOfA++;
				break;
				case'e':
				count++;
				countOfE++;
				break;
				case 'i':
					count++;
					break;
					case 'o':case 'u':
				count++;
			}
		}
		if(count==0){
			System.out.println("No Vowels Present in the Given string: "+word);
		}
		else
		System.out.println("vowels count: "+count);
		System.out.println("count of a is: "+countOfA);
		System.out.println("count of e is: "+countOfE);
		
	}
	/*
	 * public static void main(String...a) {
	 * 
	 * try(Scanner input=new Scanner(System.in)){
	 * System.out.println("Enter the string: "); String word=input.nextLine();
	 * char[] characters=word.toCharArray(); int count=0; for(char
	 * letter:characters) {
	 * if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u') {
	 * count++; } } System.out.println(" the no of vowels "+count); }
	 * 
	 * }
	 */
}
