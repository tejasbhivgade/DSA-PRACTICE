package com.tejas;

import java.util.Scanner;

public class sumOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int arr [] = new int[5]; 
		
		int arr[] = {4,5,6,7,8};
		
		int sum = 0;
		
		//System.out.println("Enter the element");
		
		// 1. using for loop
		
//		for (int i = 0; i < arr.length; i++) 
//		{
//			sum = sum +arr[i];
//		}
		
		// 2. using for each loop
		
		for (int value : arr) {
			sum +=value;
		}
		
		System.out.println(+sum);
		
		
		
	}

}
