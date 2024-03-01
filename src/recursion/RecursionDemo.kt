package recursion

/**
 * Basic demonstration of Recursion in the Kotlin language
 * <p>
 *     The following code samples are borrowed from Programiz
 *     with the sole intent to demonstrate basic implementation of recursion in the Kotlin
 *     language. Samples have been modified.
 * </p>
 * @see <a href="https://www.programiz.com/kotlin-programming/recursion">Programiz</a>
 * @author Clark Rodriguez
 */
class RecursionDemo {
    fun callFactorial(){
        println("~~BASIC RECURSION DEMO~~")
        val number = 5
        val result: Long

        result = factorial(number)
        println("Factorial of $number = $result")
    }

    fun factorial(n: Int): Long {
        //Recursive function that returns the factorial of a number
        return if (n == 1) n.toLong() else n * factorial(n - 1)
    }
}