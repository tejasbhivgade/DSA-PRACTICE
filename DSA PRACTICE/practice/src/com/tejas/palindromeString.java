package com.tejas;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string ");
		
		String str = sc.next();
		
		String rev = "";
		
		String org_str = str;
		
		int len = str.length();
				
		for (int i = len - 1 ; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
				
		if (org_str.equals(rev)) {
			System.out.println(org_str+ " is a palindrome string");
		} else {
			System.out.println(org_str+ " is not a palindrome string");

		}
	
	}
	
}
