package conditionals

/**
 * Basic 'when' code demonstrations in the Kotlin language
 * <p>
 *     The following code samples are borrowed from Programiz
 *     with the sole intent to demonstrate basic usage of 'when' expressions in the Kotlin
 *     language. Samples have been modified.
 * </p>
 * @see <a href="https://www.programiz.com/kotlin-programming/when-expression">Programiz</a>
 * @author Clark Rodriguez
 */
class WhenDemo {

    fun basicWhen(){
        println("~~BASIC WHEN DEMO~~")

        val a = 124
        val b = 23

        print("Enter operator (+ , -, *, /): ")
        val operator = readLine()

        /*Note: 'when' does NOT have to be used as an expression
        and can stand on its own.
         */
        val result = when (operator){
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> a / b
            else -> "$operator is invalid."
        }

        println("result = $result")

        /*
        Expected output:
        (+) -> result = 147
        (-) -> result = 101
        (*) -> result = 2852
        (/) -> result = ~5.39
         */
    }

    fun branchedWhen(){
        println("~~BRANCHED-WHEN DEMO~~")

        val n = -1
        when (n){
            1,2,3 -> println("$n is a positive integer less than 4.")
            0 -> println("$n is zero.")
            -1,-2 -> println("$n is a negative integer greater than -3.")
        }

        /*
        Expected Output:
        -1 is a negative integer greater than -3.
         */
    }

    fun rangedWhen(){
        println("~~RANGED-WHEN DEMO~~")

        val a = 124

        when (a) {
            in 1..10 -> println("Positive number less than 11")
            in 10..200 -> println("Positive number between 10 and 200 (inclusive)")
        }

        /*
        Expected Output:
        Positive number between 10 and 200 (inclusive)
         */
    }

    fun expressionWhen(){
        println("~~EXPRESSION WHENS~~")
        val a = 124
        val b = "124"

        when (b) {
            "Rat" -> println("FauRATs")
            12.toString() -> println("Close but no cigar.")
            a.toString() -> println("$a knows its 124 by knowing when it's not $b.")
        }

        /*
        Expected Output:
        124 knows its 124 by knowing when it's not 124.
         */
    }


}