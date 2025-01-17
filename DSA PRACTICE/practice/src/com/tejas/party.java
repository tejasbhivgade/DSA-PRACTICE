package com.tejas;

import java.util.Scanner;

public class party {

	    public static int minimumCost(int N, int[] A, int[] B) {
	        int result = 0;

	        // Iterate over each gift and calculate the minimum cost
	        for (int i = 0; i < N; i++) {
	            result = result+ Math.min(A[i], B[i]); // Add the minimum cost of the ith gift to the result
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read number of gifts
	        int N = scanner.nextInt();

	        // Read costs in shop A
	        int[] A = new int[N];
	        for (int i = 0; i < N; i++) {
	            A[i] = scanner.nextInt();
	        }

	        // Read costs in shop B
	        int[] B = new int[N];
	        for (int i = 0; i < N; i++) {
	            B[i] = scanner.nextInt();
	        }

	        // Output the minimum cost
	        System.out.println(minimumCost(N, A, B));

	        scanner.close();
	    }
	}


