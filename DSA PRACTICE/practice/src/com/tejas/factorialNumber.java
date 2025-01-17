package com.tejas;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number whose factorial you want : ");
		
		int number = sc.nextInt();
		
		long factorial = 1;
		
		for (int i = 1; i <= number; i++) {
			
			factorial = factorial * i;
			 
		}
		
		System.out.println("the factorial of the number is : "+factorial);

	}

}
