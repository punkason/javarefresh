package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
    	//capitalize the first character only
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
    	//Change to Upper Case
        return firstName.substring(0, 1).toUpperCase() + "." + lastName.substring(0, 1).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
    	originalPrice +=originalPrice*vatRate/100; // add VAT
    	originalPrice = Math.round(originalPrice*100)/100.0; //rounding to two decimal places
    	return originalPrice;
    }

    public String reverse(String sentence) {
        StringBuffer buffer = new StringBuffer(sentence);
        String result = buffer.reverse().toString(); //reverse the order and change to String  
        return result;
    }

    public int countLinuxUsers(List<User> users) {
    	int count = 0;
        for(User usr : users) {//loop every members in list
            if (usr.getType().equals("Linux")) {
            	count++; //counting
            }
        }
    	return count;
    }
}
