package com.tejas;

public class evenOddFromArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		// 1. by for loop
		
//		System.out.println("The even number in array is : ");
//		
//		for (int i = 0; i < arr.length; i++) 
//		{
//			if (arr[i]%2==0) {
//				System.out.println(arr[i]);
//			}
//		}
//		
//		System.out.println("The odd number in array is : ");
//		
//		for (int i = 0; i < arr.length; i++) 
//		{
//			if (arr[i]%2!=0) {
//				System.out.println(arr[i]);
//			}
//		}
		
		// 2. by for each loop

		System.out.println("The even number in array is : ");

		for (int value : arr) 
		{
			if (value%2==0) {
				System.out.println(+value);
			}
		}
		
		System.out.println("The odd number in array is : ");

		for (int value : arr) 
		{
			if (value%2!=0) {
				System.out.println(+value);
			}
		}
		
	}

}
