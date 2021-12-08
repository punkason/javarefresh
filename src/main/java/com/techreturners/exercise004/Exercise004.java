package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Exercise004 {
	private LocalDateTime dateTime;
    
    private LocalDateTime calculation(LocalDateTime originalTime) {//add 1000000000 seconds to the existing value
    	LocalDateTime newTime = originalTime.plus(1000000000,ChronoUnit.SECONDS);
		return newTime;
    }
    
    public Exercise004(LocalDate date) {//constructor with LocalDate
    	dateTime = calculation(date.atStartOfDay()); //convert LocalDate to LocalDateTime and add 1000000000 seconds
    }

    public Exercise004(LocalDateTime dateTime) {//constructor with LocalDateTime
        this.dateTime = calculation(dateTime); //add 1000000000 seconds
    }

    public LocalDateTime getDateTime() {
    	return dateTime;
    }
}
