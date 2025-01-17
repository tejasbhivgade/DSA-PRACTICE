package com.tejas;

public class removeJunk {

	public static void main(String[] args) {

		String s = "%Ab1*^B%*1^a5%#6@!A@#!# ";
		
		s=s.replaceAll("[^a-z A-B 0-9]", "");
		
		String s1 = "testing %$&%)()_*&selenium ^%@%^!^%$java*&&*";
		
		s1=s1.replaceAll("[^a-zA-Z0-9 ]", "");
		
		System.out.println(s);
		
		System.out.println(s1);
		
	}

}
