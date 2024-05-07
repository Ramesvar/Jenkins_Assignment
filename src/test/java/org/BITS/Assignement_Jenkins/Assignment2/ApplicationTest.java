package org.BITS.Assignement_Jenkins.Assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    void addTest() {
    	int c = new Application().add(1,2);
    	assertEquals(c, 3);
    	System.out.println("Pass");
    }
}
