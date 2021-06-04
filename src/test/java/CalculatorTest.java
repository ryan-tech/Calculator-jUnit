import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator testCalculator;

    @BeforeEach
    public void setUp() throws Exception {
        testCalculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(10, testCalculator.add(3, 7));
    }

    @Test
    public void testSubtraction() {
        assertEquals(4, testCalculator.subtract(7, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(21, testCalculator.multiply(3, 7));
    }

    @Test
    public void testDivide() {
        assertEquals(3, testCalculator.divide(18.0, 6.0));
    }

}
