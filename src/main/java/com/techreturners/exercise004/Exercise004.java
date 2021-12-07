package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Exercise004 {
	private LocalDateTime dateTime;
    public Exercise004(LocalDate date) {
    	dateTime = calculation(date.atStartOfDay());
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = calculation(dateTime);
    }
    
    private LocalDateTime calculation(LocalDateTime originalTime) {
    	LocalDateTime newTime = originalTime.plus(1000000000,ChronoUnit.SECONDS);
		return newTime;
    }

    public LocalDateTime getDateTime() {
    	return dateTime;
    }
}
