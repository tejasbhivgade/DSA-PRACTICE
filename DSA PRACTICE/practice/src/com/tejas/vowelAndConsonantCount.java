package com.tejas;

import java.util.Scanner;

public class vowelAndConsonantCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		
		String str = sc.next();
		
		int vowels = 0, consonant = 0;
		
		for (char c : str.toCharArray()) {
			
			if ("aeiouAEIOU".indexOf(c)!=-1) {
				vowels ++;
			}
			else if (Character.isLetter(c)) {
				consonant++;
			}	
		}
		
		
		System.out.println("Vowels : "+vowels+ ",Consonants :"+consonant);
	}

}
