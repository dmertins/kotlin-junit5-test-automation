import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test fun addition() {
        assertEquals(2, Calculator.add(1, 1))
    }

    @Test fun subtraction() {
        assertEquals(1, Calculator.subtract(2, 1))
    }

    @Test fun multiplication() {
        assertEquals(4, Calculator.multiply(2, 2))
    }

    @Test fun division() {
        assertEquals(3, Calculator.divide(6, 2))
    }
}
