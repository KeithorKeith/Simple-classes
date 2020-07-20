import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before() {
        this.calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void canSubtract() {
        assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    public void canMultiply() {
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void canDivide() {
        assertEquals(1.2, calculator.divide(6, 5), 0.01);
    }


}
