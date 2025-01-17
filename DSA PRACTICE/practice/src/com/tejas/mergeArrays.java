package com.tejas;

import java.util.Arrays;

public class mergeArrays {

	    public static void main(String[] args) {
	        // Define two arrays to merge
	        int[] array1 = {1, 3, 5, 7};
	        int[] array2 = {2, 4, 6, 8};

	        // Merge the arrays
	        int[] mergedArray = mergeArrays(array1, array2);

	        // Print the merged array
	        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
	    }

	    // Method to merge two arrays
	    public static int[] mergeArrays(int[] array1, int[] array2) {
	        // Create a new array large enough to hold both input arrays
	        int[] mergedArray = new int[array1.length + array2.length];

	        // Copy elements of the first array
	        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

	        // Copy elements of the second array
	        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

	        return mergedArray;
	    }
	}



