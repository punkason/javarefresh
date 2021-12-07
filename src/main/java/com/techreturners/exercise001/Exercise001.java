package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
    	String capitial = word.substring(0, 1).toUpperCase() + word.substring(1);
        return capitial;
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
    	String initials = firstName.substring(0, 1).toUpperCase() + "." + lastName.substring(0, 1).toUpperCase();
        return initials;
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
    	originalPrice +=originalPrice*vatRate/100;
    	originalPrice = Math.round(originalPrice*100)/100.0;
    	return originalPrice;
    }

    public String reverse(String sentence) {
        // Add your code here
        StringBuffer buffer = new StringBuffer(sentence);
        String result = buffer.reverse().toString();   
        return result;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
    	int count = 0;
        for(User tmp : users) {
            if (tmp.getType().equals("Linux")) {
            	count++;
            }
        }
    	return count;
    }
}
