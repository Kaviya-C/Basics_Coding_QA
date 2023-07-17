package com.kaviya.java.may25k2023;
import java.util.Map;
import java.util.HashMap;


//Map is an interface that represents a collection of key-value pairs, where each key is unique. 
//In this case, the keys are characters representing vowels, and the values are integers representing 
//the count of each vowel.
public class VowelsLettersCountKeyValue {
		    public static void main(String[] args) {
	        String input = "lmhtyor";
	        Map<Character, Integer> vowelCount = countVowels(input);

	        for (Map.Entry<Character, Integer> entry : vowelCount.entrySet()) {
	            char vowel = entry.getKey();
	            int count = entry.getValue();

	            if (count > 1) {
	                System.out.println("Vowel '" + vowel + "' repeated " + count + " times.");
	            }
	            else
	            	 System.out.println("Vowel '" + vowel + "' repeated " + count + " times.");
	        }
	    }

	    private static Map<Character, Integer> countVowels(String str) {
	        Map<Character, Integer> vowelCount = new HashMap<>();
	        System.out.println(vowelCount);
	        str = str.toLowerCase();

	        for (char ch : str.toCharArray()) {
	            if (isVowel(ch)) {
	                vowelCount.put(ch, vowelCount.getOrDefault(ch, 0) + 1);
	                System.out.println(ch);
	            }
	        }
System.out.println(vowelCount);
	        return vowelCount;
	    }

	    private static boolean isVowel(char ch) {
	        ch = Character.toLowerCase(ch);
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }
	
}
