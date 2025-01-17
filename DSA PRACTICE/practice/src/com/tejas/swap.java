package com.tejas;

public class swap {
	
	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		System.out.println("element before swapping "+a+" , "+b);
		
		
		//===================== logic 01 :- using third variable ========================
		
//		    int t = a;  //10
//				a = b;  //20
//				b = t;  //10
				
		//======================= logic 02 :- use + & - without using third variable =======================
				
//				a = a + b;  //10+20=30
//				b = a - b;  //30-20=10
//				a = a - b;  //30-10=20
				
		//============================ logic 03 :- use * & / without using third variable =========================
		
//		        a = a * b;  //10*20=200
//		        b = a / b;  //200/20=10
//		        a = a / b;  //200/10=20
		
	    //========================= logic 04 :- bitwise XOR (^) ===========================
		
//		        a = a ^ b;  //30^10=30
//		        b = a ^ b;  //30^20=10
//		        a = a ^ b;  //30^10=20
		
	    //============================= logic 04 :- single statement ===========================
		        
		        b = a + b - (a = b);
		
				
		System.out.println("element before swapping "+a+" , "+b);

		
		
	}

}
