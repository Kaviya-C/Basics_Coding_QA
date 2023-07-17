package com.kaviya.java.may25k2023;

public class FizzbuzzProg {
	public static void main(String[] args) {
		for(int index=0;index<=100;index++) {
			if(index%3==0 &&index%5==0) 
				System.out.print("FizzBuzz");
			else if(index%5==0)
				System.out.print("Buzz");
			else if(index%3==0)
				System.out.print("Fizz");
			else
				System.out.print(index);
			System.out.println();
		}
		
	}

}
