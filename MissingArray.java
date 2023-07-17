package com.kaviya.java.may25k2023;

// consider one array of n numbers  u have to find the missing number from that 
// array make sure that array should not contain duplicates
public class MissingArray {
	public static void main(String[] a) {
		int[] array= {1,2,3,7,5,6,8,9,4,10,11,12,13,14,15,16,17,18,19};
		
		int sum=(20*21)/2;
		int actualSum=0;
		for(int a1 :array) {
			actualSum+=a1;
			
		}
		//System.out.println(sum+   "   "+actualSum);
		
		System.out.println("missing number: "+(sum-actualSum)); 
		
	}

}
