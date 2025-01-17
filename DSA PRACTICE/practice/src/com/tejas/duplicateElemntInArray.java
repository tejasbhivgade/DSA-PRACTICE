package com.tejas;

import java.util.HashSet;

public class duplicateElemntInArray {

	public static void main(String[] args) {
		
//		int arr[] = {1,6,5,8,4,9,7,3,};
		
		// 1. Approach using for loop
		
//		boolean flag = false;
//		
//		for (int i = 0; i < arr.length; i++) 
//		{
//			for (int j = i + 1; j < arr.length; j++) 
//			{
//				if (arr[i] == arr[j]) 
//				{
//					System.out.println("the duplicate element from the above array is : "+arr[i]);
//					flag = true;
//				}
//			
//			}
//		}
//		
//		if (flag==false) 
//		{
//			System.out.println("duplicate element are not found");
//		}
		
		// 2. Approach using hash
		
		int arr[] = {1,6,5,8,4,9,7,3,9};

		HashSet<Integer> tk = new HashSet<>();
		
		boolean flag = false;
		
		for (Integer d : arr) 
		{
			if (tk.add(d)==false) 
			{
				System.out.println("duplicate element are "+d);
				flag = true;
			}
		}
		if (flag==false) 
		{
			System.out.println("duplicate are not found");
		}
		
	}

}
