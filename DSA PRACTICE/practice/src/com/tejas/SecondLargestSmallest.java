
package com.tejas;

public class SecondLargestSmallest {

    public static void main(String[] args) {

        int[] arr = {54, 69, 36, 87, 89, 5, 6, 75};
        
        // Initializing variables
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstSmall = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        // Finding second largest and second smallest
        for (int num : arr) {
            // For second largest
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }

            // For second smallest
            if (num < firstSmall) {
                secondSmall = firstSmall;
                firstSmall = num;
            } else if (num < secondSmall && num != firstSmall) {
                secondSmall = num;
            }
        }

        // Output the results
        System.out.println("The second largest element is: " + secondMax);
        System.out.println("The second smallest element is: " + secondSmall);
    }
}

