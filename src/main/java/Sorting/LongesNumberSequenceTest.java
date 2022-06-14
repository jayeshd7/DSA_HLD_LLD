package Sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongesNumberSequenceTest {
    LongesNumberSequence longesNumberSequence = new LongesNumberSequence();




    @Test
    public void numericValueInString() {
        String message = "1234";
        int size = message.length();
        assertEquals("1234", longesNumberSequence.longestNumberSequenceSolve(message, size));
    }

    @Test
    public void characterValueInString() {
        String message = "abcd";
        int size = message.length();
        assertEquals("0", longesNumberSequence.longestNumberSequenceSolve(message, size));
    }

    @Test
    public void duplicateIntegerLongestInString() {
        String message = "abcd1234cc1234";
        int size = message.length();
        assertEquals("1234", longesNumberSequence.longestNumberSequenceSolve(message, size));
    }

    @Test
    public void sameLengthIntegerLongestInString() {
        String message = "abcd1234cc5678";
        int size = message.length();
        //first one 1234
        assertEquals("1234", longesNumberSequence.longestNumberSequenceSolve(message, size));
    }


    @Test
    public void emptyString() {
        String message = "";
        int size = message.length();
        // no digit present
        assertEquals("0", longesNumberSequence.longestNumberSequenceSolve(message, size));
    }





}