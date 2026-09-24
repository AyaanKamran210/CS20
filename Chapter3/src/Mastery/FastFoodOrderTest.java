package Mastery;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FastFoodOrderTest {

    @Test
    void testSubtotalCalculation() {
        // Book case: 2 burger, 5 fries, 5 soda = $13.78
        double expectedSubtotal = 13.78;
        double actualSubtotal = (2 * 1.69) + (5 * 1.09) + (5 * 0.99);
        
        assertEquals(expectedSubtotal, actualSubtotal, 0.001);
    }
}

