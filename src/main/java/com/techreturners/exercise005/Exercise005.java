package com.techreturners.exercise005;

import java.util.Arrays;

public class Exercise005 {
	private int[] alphabet; //count the number of occurrence of each alphabet
	public Exercise005() {
		alphabet = new int[26];
		Arrays.fill(alphabet, 0);		
	}
	
	private void checking(String input) {
    	for(int i = 0; i<input.length();i++) {
    		input = input.toLowerCase(); //accepts both upper and lower cases
    		char curChar = input.charAt(i);
    		if(curChar >='a' && curChar <='z') {
    			int a = curChar - 'a';
    			alphabet[a]++;
    			//System.out.println (a + " " + alphabet[a]);
    		}else { //ignore space
    			continue;
    		}
    	}
    }

    public boolean isPangram(String input) {
    	checking(input);
        int length = alphabet.length;
        for(int i = 0; i < length;i++) {
        	if (alphabet[i] == 0) // any character found 0 will return false
        		return false;
        	else if(i+1 == length) //checked z also okay, then result will be true
        		return true;
        }
        return false;
    }
    


}
