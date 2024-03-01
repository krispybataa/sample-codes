package recursion

import java.math.BigInteger

/**
 * Basic demonstration of Tail Recursion in the Kotlin language
 * <p>
 *     The following code samples are borrowed from Programiz
 *     with the sole intent to demonstrate basic implementation of tail recursion in the Kotlin
 *     language. Samples have been modified.
 * </p>
 * @see <a href="https://www.programiz.com/kotlin-programming/recursion">Programiz</a>
 * @author Clark Rodriguez
 */
class TailRecursionDemo {
    /*
    Tail recursion in Kotlin involves performing the calculations first
    before executing any recursive calls. Making any such calls equivalent to looping
    and avoiding any risk of Stack Overflow
     */

    fun callTaiLRec(){
        println("~~BASIC TAIL RECURSION DEMO~~")

        val n = 10
        val first = BigInteger("0")
        val second = BigInteger("1")

        println(fibonacci(n, first, second))
    }

    tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger{
        return if(n == 0) a else fibonacci(n-1, b, a + b)
    }
}