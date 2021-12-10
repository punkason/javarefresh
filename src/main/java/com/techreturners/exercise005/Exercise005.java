package com.techreturners.exercise005;

import java.util.Arrays;

public class Exercise005 {
	private int[] alphabet; //count the number of occurrence of each alphabet
	private int noOfAlphabet = 26; //26 alphabet
	private void checking(String input) { //checking character one by one
    	for(int i = 0; i<input.length();i++) {
    		input = input.toLowerCase(); //accepts both upper and lower cases
    		char curChar = input.charAt(i);
    		if(curChar >='a' && curChar <='z') { //ignore space + digit + symbols
    			int a = curChar - 'a';
    			alphabet[a]++;
    		}
    	}
    }
	
	public Exercise005() {//Constructor
		alphabet = new int[noOfAlphabet];
		Arrays.fill(alphabet, 0); //set all to 0		
	}

    public boolean isPangram(String input) {
    	checking(input);
        for(int i = 0; i < noOfAlphabet;i++) {
        	if (alphabet[i] == 0) // any character found 0 will return false
        		return false;
        	else if(i+1 == noOfAlphabet) //checked z also okay, then result will be true
        		return true;
        }
        return false; //if input is empty
    }
}