package com.techreturners.exercise005;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Exercise005Test {

    private Exercise005 ex005;

    @Before
    public void setup() {
        ex005 = new Exercise005();
    }

    @Test //1
    public void checkEmptySentenceIsNotAPangram() {
        assertFalse(ex005.isPangram(""));
    }

    @Test //2
    public void checkPerfectLowerCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test //3
    public void checkPerfectUpperCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test //4
    public void checkSentenceWithLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("the quick brown fox jumps over the lazy dog"));
    }

    @Test //5
    public void checkSentenceWithMixedUpperAndLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("The Five boXing wiZards Jump QuicklY"));
    }

    @Test //6
    public void checkSentenceWithMissingLetterXIsNotAPangram() {
        assertFalse(ex005.isPangram("the quick brown fo jumps over the lazy dog"));
    }

    @Test //7
    public void checkSentenceWithMissingLetterHIsNotAPangram() {
        assertFalse(ex005.isPangram("five boxing wizards jump quickly at it"));
    }

    @Test //8
    public void checkSentenceWithUnderscoresIsAPangram() {
        assertTrue(ex005.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }

    @Test //9
    public void checkSentenceWithNumbersIsAPangram() {
        assertTrue(ex005.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"));
    }
    
    @Test //10
    public void check26aIsNotAPangram() {
        assertFalse(ex005.isPangram("aaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test //11
    public void checkSentenceWithExtraSpaceIsAPangram() {
        assertTrue(ex005.isPangram("The         quick brown fox jumps over the lazy dog"));
    }
    
    @Test //12
    public void checkSentenceWithSpaceOnlyIsNotAPangram() {
        assertFalse(ex005.isPangram(" "));
    }
    
    @Test //13
    public void checkSentenceWithDigitOnlyIsNotAPangram() {
        assertFalse(ex005.isPangram("1"));
    }
    
    @Test //14
    public void checkSentenceWithSymbolOnlyIsNotAPangram() {
        assertFalse(ex005.isPangram("?"));
    }
}
