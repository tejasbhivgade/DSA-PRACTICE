package com.tejas;

import java.io.*;
import java.util.Scanner;

public class TestClass {

    // Method to return the FizzBuzz result for a given array
    public static String getResult(int num) {
        // Initialize the result string
        String res = "";

        // Check divisibility by 3 and 5
        if (num % 3 == 0 && num % 5 == 0) {
            res = "fizzbuzz";
        } else if (num % 3 == 0) {
            res = "fizz";
        } else if (num % 5 == 0) {
            res = "buzz";
        } else {
            res = "not fizzbuzz";
        }

        // Return the result
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements
        int n = sc.nextInt();

        // Create an array to store the input numbers
        int[] num = new int[n];

        // Read the numbers into the array
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        // For each number in the array, call getResult and print the result
        for (int i = 0; i < n; i++) {
            System.out.println(getResult(num[i]));
        }

        // Close the scanner
        sc.close();
    }
}