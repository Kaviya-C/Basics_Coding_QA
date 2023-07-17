package com.kaviya.java.may25k2023;

public class FibonacciSeries {
	public static void main (String[] a) {
		
		int first=-1;
		int second=1;
		int count=0;
		while(count<= 13) {
			System.out.println(first+second);
			second=first+second;
			first=second-first;
			
			count++;
		}	
	}
}
