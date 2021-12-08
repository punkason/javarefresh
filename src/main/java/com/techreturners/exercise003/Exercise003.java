package com.techreturners.exercise003;

import java.util.ArrayList;
import java.util.List;

public class Exercise003 {
	private List<String> iceCream = new ArrayList<>();
	
	public Exercise003() {//Constructor
		iceCream.add("Pistachio");
		iceCream.add("Raspberry Ripple");
		iceCream.add("Vanilla");
		iceCream.add("Mint Chocolate Chip");
		iceCream.add("Chocolate");
		iceCream.add("Mango Sorbet");
	}
	
    int getIceCreamCode(String iceCreamFlavour) {
    	int index = iceCream.indexOf(iceCreamFlavour); //check the index in the list
        return index;
    }

    String[] iceCreamFlavours() {
    	String[] ic = new String[iceCream.size()];
    	iceCream.toArray(ic); //convert list to array
    	return ic;
    }

}
