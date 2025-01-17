package com.tejas;

import java.util.Arrays;

public class passingInFunction {

	public static void main(String[] args) {
		
		int[] nums = {10,20,30,40,50};
		System.out.println(Arrays.toString(nums));
		change(nums);
		System.out.println(Arrays.toString(nums));
	}
		
	private static void change(int[] arr) {
		// TODO Auto-generated method stub
		arr[3]=100;
	}


}
