package com.tejas;

import java.util.HashMap;
import java.util.Map;

public class nextHireAssesment {
    
    public static String findFirstCharacter(String s) {
        
        Map<Character, Integer> charMap = new HashMap<>();
        Map<Character, Integer> firstIndexMap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
            if (!firstIndexMap.containsKey(ch)) {
                firstIndexMap.put(ch, i);
            }
        }
        
        char result = '\0';
        int minIndex = Integer.MAX_VALUE;
        
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            if (count == 1 && firstIndexMap.get(ch) < minIndex) {
                minIndex = firstIndexMap.get(ch);
                result = ch;
            }
        }
        
        return result == '\0' ? "-1" : String.valueOf(result);
    }
    
    public static void main(String[] args) {
        
        System.out.println(findFirstCharacter("swiss"));  
        System.out.println(findFirstCharacter("aabbcc"));  
        System.out.println(findFirstCharacter("leetcode")); 
    }
}
