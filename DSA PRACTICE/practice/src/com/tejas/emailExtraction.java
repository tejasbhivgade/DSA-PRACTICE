package com.tejas;

public class emailExtraction {
    
    public static void Extraction(String str) {
        String sep = "@";
        int pos = str.lastIndexOf(sep);
        String input = str.substring(0, pos);
        int len = input.length();
        System.out.println("Length before '@' : " + len);
    }

    public static void main(String[] args) {

    	String str = "example.email@gmail.com";
        Extraction(str);
    }
}

