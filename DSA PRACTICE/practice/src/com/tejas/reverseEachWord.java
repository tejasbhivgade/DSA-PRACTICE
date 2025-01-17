package com.tejas;

//public class reverseEachWord {
//    public static void main(String[] args) {
//        String input = "reverse each word in a string";
//        String output = reverseWords(input);
//        System.out.println(output);
//    }
//
//    public static String reverseWords(String str) {
//        // Split the string by spaces
//        String[] words = str.split(" ");
//        StringBuilder reversedString = new StringBuilder();
//
//        // Reverse each word
//        for (String word : words) {
//            StringBuilder reversedWord = new StringBuilder(word);
//            reversedWord.reverse();
//            reversedString.append(reversedWord).append(" ");
//        }
//
//        // Convert StringBuilder to String and trim the last space
//        return reversedString.toString().trim();
//    }
//}


public class reverseEachWord {
    public static void main(String[] args) {
        String input = "reverse each word in a string";
        String output = reverseWords(input);
        System.out.println(output);
    }

    public static String reverseWords(String str) {
        // Split the string by spaces
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        // Reverse each word using a for loop
        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            reversedString.append(reversedWord).append(" ");
        }

        // Convert StringBuilder to String and trim the last space
        return reversedString.toString().trim();
    }
}

