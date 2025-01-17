package com.tejas;

public class removeWhiteSpaces {

	public static void main(String[] args) {

		String s = "java     testing   automation";
		
		System.out.println("Before removing white spaces : "+s);
		
		s= s.replaceAll("\\s", "");
		
		System.out.println("After removing white spaces : "+s);
		
	}

}
