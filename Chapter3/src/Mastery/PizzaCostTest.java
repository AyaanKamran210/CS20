package Mastery;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PizzaCostTest {

    @Test
    void testBookSampleCase() {
        double expected = 6.75;
        double actual = PizzaCost.calculateCost(10.0);
        
        assertEquals(expected, actual, 0.001);
    }
}
