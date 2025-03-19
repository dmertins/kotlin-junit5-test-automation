class Calculator {
    companion object {
        @JvmStatic fun add(a: Int, b: Int) = a + b
        @JvmStatic fun subtract(a: Int, b: Int) = a - b
        @JvmStatic fun multiply(a: Int, b: Int) = a * b
        @JvmStatic fun divide(a: Int, b: Int) = a / b
    }
}

fun main() {
    val a = 8
    val b = 2
    println("$a + $b = ${Calculator.add(a, b)}")
    println("$a - $b = ${Calculator.subtract(a, b)}")
    println("$a * $b = ${Calculator.multiply(a, b)}")
    println("$a / $b = ${Calculator.divide(a, b)}")
}
