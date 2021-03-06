package com.techreturners.exercise004;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class Exercise004Test {

    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 03, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }
    /*
     * Additional Unit Test
     */
    @Test
    public void checkGetDateTimeStartsAt1900() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(1900, Month.JANUARY, 1, 0, 0, 0, 0));
        LocalDateTime expected = LocalDateTime.of(1931, Month.SEPTEMBER, 10, 1, 46, 40);
        assertEquals(expected, ex004.getDateTime());
    }
    
    @Test
    public void checkGetDateTimeChangeTo2000() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(1999, Month.DECEMBER, 12, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2031, Month.AUGUST, 21, 1, 46, 39);
        assertEquals(expected, ex004.getDateTime());
    }
    
    @Test
    public void checkGetDateTimeWithFiveDigits() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(9999, Month.DECEMBER, 12, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(10031, Month.AUGUST, 21, 1, 46, 39);
        assertEquals(expected, ex004.getDateTime());
    }

}
