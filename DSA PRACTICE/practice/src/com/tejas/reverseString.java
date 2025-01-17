package com.tejas;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class reverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string ");
			
		String str = sc.next();
		
		String rev = "";
		
		//================================ 1. using string concatination operator =================================
		
//		int len = str.length();
//		
//		for(int i = len - 1; i >= 0; i--) {
//			rev = rev+str.charAt(i);
//		}
		
		//==================================== 2. using character array ========================================
		
//		char arr[]= str.toCharArray();
//		
//		int len = arr.length;
//		
//		for (int i = len - 1; i >= 0; i--) {
//			
//			rev = rev + arr[i];
//			
//		}
		
		//============================== 3. using string buffer class ================================
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb.reverse());
		
		System.out.println(rev);
		

	}

}
