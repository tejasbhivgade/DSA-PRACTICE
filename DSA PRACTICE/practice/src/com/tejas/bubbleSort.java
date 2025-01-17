package com.tejas;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {

		int arr[] = {4,5,2,8,6,7,9,1,7};
		
		System.out.println("Arrays before sorting : "+Arrays.toString(arr));
		
		int n = arr.length;
		
		int swap_count = 0;
		
		int comparision_count = 0;
		
		for (int i = 0; i < n-1; i++) //number of passes
		{
		    comparision_count++;
			for (int j = 0; j < n-i-1; j++) //iteration in each pass
			{
				if (arr[j]>arr[j+1]) 
				{
					swap_count++;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					swap_count++;
					
				}
			}
		}
		System.out.println(+swap_count);
		System.out.println(+comparision_count);
		System.out.println("Arrays after sorting"+Arrays.toString(arr));
		
	}

}
