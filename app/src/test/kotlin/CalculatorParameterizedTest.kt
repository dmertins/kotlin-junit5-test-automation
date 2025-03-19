import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource

class CalculatorParameterizedTest {

    @ParameterizedTest
    @CsvSource(
        " 1,  1,  2",
        " 2, -1,  1",
        "-2,  1, -1",
        "-2, -2, -4",
        " 0,  1,  1",
        "-1,  0, -1",
        " 0,  0,  0",
    )
    fun addition(a: Int, b: Int, result: Int) {
        assertEquals(result, Calculator.add(a, b))
    }
}

class MultiplicationParameterizedTest {

    @ParameterizedTest
    @CsvSource(useHeadersInDisplayName = true, value = [
        " a,  b, result",
        " 1,  1,  1",
        "-1,  2, -2",
        " 2, -3, -6",
        "-2, -2,  4",
    ])
    fun `multiplication sign`(a: Int, b: Int, result: Int) {
        assertEquals(result, Calculator.multiply(a, b))
    }

    @ParameterizedTest
    @CsvSource(useHeadersInDisplayName = true, value = [
        " a,  b, result",
        " 0,  1,  0",
        " 0, -2,  0",
        " 2,  0,  0",
        "-3,  0,  0",
        " 0,  0,  0",
    ])
    fun `multiply by zero`(a: Int, b: Int, result: Int) {
        assertEquals(result, Calculator.multiply(a, b))
    }
}

class SubtractionMethodSourceParameterizedTest {

    @ParameterizedTest
    @MethodSource("parametersProvider")
    fun subtraction(a: Int, b: Int, result: Int) {
        assertEquals(result, Calculator.subtract(a, b))
    }

    companion object {
        @JvmStatic fun parametersProvider(): Array<Arguments> {
            return arrayOf(
                arguments(1, 1, 0),
                arguments(1, -1, 2),
                arguments(-1, 1, -2),
                arguments(-1, -1, 0),
                arguments(0, 0, 0),
            )
        }
    }
}

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DivisionMethodSourceParameterizedTest {

    @ParameterizedTest
    @MethodSource("parametersProvider")
    fun division(a: Int, b: Int, result: Int) {
        assertEquals(result, Calculator.divide(a, b))
    }

    fun parametersProvider(): Array<Arguments> {
        return arrayOf(
            arguments(2, 1, 2),
            arguments(1, 1, 1),
            arguments(-2, 1, -2),
            arguments(-1, 1, -1),
            arguments(0, 1, 0),
        )
    }
}
