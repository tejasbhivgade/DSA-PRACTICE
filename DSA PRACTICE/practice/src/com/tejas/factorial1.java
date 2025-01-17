package com.tejas;

import java.util.Scanner;

public class factorial1 {

    private static int factorial(int number) {
        if (number <= 1) { // Base case: factorial of 0 or 1 is 1
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer:");

        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }

        sc.close(); // Close the Scanner to release resources
    }
}
