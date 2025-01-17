package com.tejas;

public class countCharacterOccurence {

	public static void main(String[] args) {

		String s = " my name is tejas bhivgade ";
		
		int total_count = s.length(); // it will give you total length9*
		
		int total_count_after_remove = s.replace("m", "").length();
		
		int count = total_count - total_count_after_remove;
		
		System.out.println(+count);
		
		
		
		
	}

}
