package com.tejas;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {

		int arr[] = {10,50,30,90,70,80,40};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the search element : ");
		
		int search_ele = sc.nextInt();
		
		boolean flag=false;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (search_ele==arr[i]) 
			{
				System.out.println("Element found at : "+i);
				flag=true;
			}
		}
		
		if (flag==false) 
		{
			System.out.println("element not found");
		}
		
	}

}

