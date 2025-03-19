import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows

class KotlinAssertionsDemo {

    @Test fun `expected exception testing`() {
        val exception = assertThrows<ArithmeticException> {
            Calculator.divide(1, 0)
        }
        assertEquals("/ by zero", exception.message)
    }

    @Test fun `exception absence testing`() {
        assertDoesNotThrow { Calculator.divide(0, 1) }
    }

    @Test fun `grouped assertions`() {
        val person = object {
            val firstName = "John"
            val lastName = "Doe"
            val age = 47
        }
        assertAll(
            { assertEquals("John", person.firstName) },
            { assertEquals("Doe", person.lastName) },
            { assertEquals(47, person.age) },
        )
    }
}
