package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        // Add your code here
    	String city = person.getCity();
    	if (city.equals("Manchester"))
        	return true;
    	return false;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        // Add your code here
    	int age = person.getAge();
    	if ( age >= ageLimit)
    		return true;
        return false;
    }
    
}
