package com.tejas;

public class maxAndminElementInArray {

	public static void main(String[] args) {
		
		int arr [] = {10,50,60,80,40,5};
		
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) 
		{
			if (arr[i]>max) 
			{
				max = arr[i];
			}
		}
		
		System.out.println("The max element in array is : "+max);
		
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) 
		{
			if (arr[i]<min) 
			{
				min = arr[i];
			}
		}
		
		System.out.println("The min element in array is : "+min);

	}

}
