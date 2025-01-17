package com.tejas;

public class largestElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {2,6,4,5,7,3,6};
		
		int largest = arr[0];
		
		for (int i : arr) {
			if (i > largest) {
				largest = i;
			}
		}
		
		System.out.println(+largest);

	}
	

}
