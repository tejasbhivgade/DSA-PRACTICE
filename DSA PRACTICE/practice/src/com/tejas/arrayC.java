package com.tejas;

import java.util.*;

public class arrayC {
    public static void arrayc(int N, int M, int[] A, int[] B) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        // Iterate through each combination of A and B
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int sum = A[i] + B[j];
                
                // Check if the sum is odd and not already in the set
                if (sum % 2 != 0 && !set.contains(sum)) {
                    set.add(sum);
                    list.add(sum);
                    
                    // Stop if we have collected M elements
                    if (list.size() == M) {
                        break;
                    }
                }
            }
            if (list.size() == M) {
                break;
            }
        }
        
        // Sort the list to get elements in increasing order
        Collections.sort(list);
        
        // Print the list
        for (int i = 0; i < M; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N and M
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Read array A
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Read array B
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        // Call the arrayc function
        arrayc(N, M, A, B);
        
        scanner.close();
    }
}

