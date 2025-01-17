package com.tejas;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sortingElement {

	public static void main(String[] args) {

//		int arr[] = {20,60,50,80,90,70,10,40,30};
		
		// 1. approach 1
		
//		System.out.println("Array before sorting : "+Arrays.toString(arr));
//		
//		Arrays.sort(arr);
//		
//		System.out.println("Array after sorting : "+Arrays.toString(arr));

		// 2. approach 2
		
//		System.out.println("Array before sorting : "+Arrays.toString(arr));
//
//		Arrays.parallelSort(arr);
//
//		System.out.println("Array after sorting : "+Arrays.toString(arr));

		// reveerse descending order
		
		Integer arr[] = {20,60,50,80,90,70,10,40,30};
		
		System.out.println("Array before sorting : "+Arrays.toString(arr));

		Arrays.sort(arr,Collections.reverseOrder());

		System.out.println("Array after sorting : "+Arrays.toString(arr));

		
	}

}
