package com.kaviya.java.may25k2023;


// find number of words in a sentences and the corresponding word count
public class WordsCountLettersCount {
	public static void main(String[] a) {
	String sentences="Hello";
	count(sentences);
	}
	public static void count(String word) {
	
	char[] character=word.toCharArray();
	
	for(char c:character) {
		String s="";
		while(c<word.length()&&c!=' ') {
			
			s+=c;
			
		}
		if(s.length()>0)
			System.out.println("Word: "+s+" length: "+s.length());
	}
	}
}
