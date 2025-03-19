import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JavaAssertionsDemoTest {

    @Test void expectedExceptionTesting() {
        var exception = assertThrows(ArithmeticException.class,
                () -> Calculator.divide(1, 0)
        );
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test void exceptionAbsenceTesting() {
        assertDoesNotThrow(() -> Calculator.divide(0, 1));
    }

    @Test void groupedAssertions() {
        var person = new Object() {
            final String firstName = "John";
            final String lastName = "Doe";
            final int age = 47;
        };
        assertAll(
                () -> assertEquals("John", person.firstName),
                () -> assertEquals("Doe", person.lastName),
                () -> assertEquals(47, person.age)
        );
    }
}
