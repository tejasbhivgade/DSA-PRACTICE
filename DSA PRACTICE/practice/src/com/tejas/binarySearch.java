package com.tejas;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {

		int arr[] =  {10,20,30,40,50,60,70,80,90};
		
		// 1. logic
		
//		Scanner sc = new Scanner(System.in); 
//		
//		System.out.println("Enter the element you want to search : ");
//		
//		int key = sc.nextInt();
//		
//		int left = 0;
//		
//		boolean flag = false;
//		
//		int right =arr.length-1;
//		
//		while (left<=right) 
//		{
//			int m = (left + right) / 2;
//			
//			if (arr[m]==key) 
//			{
//				System.err.println("Element found");
//				flag= true;
//				break;
//			}
//			
//			if (arr[m] < key) 
//			{
//				left = m + 1;
//			}
//			
//			if (arr[m] > key) 
//			{
//				right = m - 1;
//			}
//			
//		}
//		
//		if (flag==false) 
//		{
//			System.out.println("Element not found");
//		}
		
		// 2. arrays.binarySearch()
		
		System.out.println(Arrays.binarySearch(arr, 80));

		
	}

}
