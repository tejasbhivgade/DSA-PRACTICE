package com.tejas;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		
	    int n = sc.nextInt();
	    
		int n1 = 0, n2 = 1,sum = 0;
		
		System.out.print(n1+" "+n2);
		
		for (int i = 2; i < n; i++) {
			
			sum = n1 + n2;
			
			System.out.print(" "+sum);
			
			n1 = n2;
			n2 = sum;
		}

	}

}
