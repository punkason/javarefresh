package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
    	String city = person.getCity();
    	if (city.equals("Manchester")) //return true only when Manchester
        	return true;
    	return false;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
    	int age = person.getAge();
    	if ( age >= ageLimit) //check age limit
    		return true;
        return false;
    }
    
}
