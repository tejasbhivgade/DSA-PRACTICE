package com.tejas;

public class missingNumberInArray {

	public static void main(String[] args) {
		
		//array should not have duplicates 
		//values should be in range
		//array no need to be in sorted order
		
		int arr[] = {1,2,3,4,5,7,8,9,10};
		
		int sum1 = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			sum1 = sum1 + arr[i];
		}
		
		System.out.println("The sum of elements of arrray is : "+sum1);

		int sum2 = 0;
		
		for (int i = 1; i <= 10 ; i++) 
		{
			sum2 = sum2 + i;
		}
		
		System.out.println("Sum of range of element in array is : "+sum2);
		
		System.out.println("Missing element in array is : "+(sum2-sum1));
		
	}

}
