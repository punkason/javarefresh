package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
    	String city = person.getCity();
    	return city.equals("Manchester"); //return true only when Manchester
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
    	int age = person.getAge();
    	//check age limit
    	return age >= ageLimit;
    }
    
}
