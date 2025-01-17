package com.tejas;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number ");
		 int num = sc.nextInt();
		 
		 //========================= 1. using algorithm ================================
		 
//	   	 int rev = 0;
//	   	 
//	   	 while(num!=0) 
//	   	 {
//		 rev=rev*10+num%10;
//		 num=num/10;
//	   	 }
	   	 
	   	 //==============================  2. using stringBuffer class =================================
	   	 
	   	 
//	   	 StringBuffer sb = new StringBuffer(String.valueOf(num));
//	   	 StringBuffer rev= sb.reverse();
		 
		 //================================== 3. using stringBuilder class =================================
		 
		 StringBuilder sb= new StringBuilder();
		 
		 sb.append(num);
		 
	     StringBuilder rev= sb.reverse();
		 
		 System.out.println("The reverse number is "+rev);

	}

}
