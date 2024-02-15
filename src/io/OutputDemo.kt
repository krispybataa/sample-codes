package io

/**
 * Basic Output code demonstrations in the Kotlin language
 * <p>
 *     The following code samples are borrowed from Programiz with the sole intent to demonstrate basic I/O in the Kotlin
 *     language. Samples have been modified.
 * </p>
 *
 * @see <a href="https://www.programiz.com/kotlin-programming/input-output">Programiz</a>
 * @author Clark Rodriguez
 */
class OutputDemo {

    fun basicOut(){
        println("~~BASIC OUTPUT~~")
        println("This is the basic output in Kotlin.")
        //Expected Output: This is the basic output in Kotlin.
    }

    fun compare(){
        println("~~COMPARISON BTWN. PRINTLN AND PRINT~~")
        println("1. This is using println")
        println("2. This is also using println")

        print("1. This is using basic print.")
        print("2. This is also using the basic print\n")
        /*
        Expected Output:
        1. println
        2. println
        1. print 2. print
         */
    }

    fun printVariables(){
        println("~~DEMONSTRATION OF PRINTING VARIABLES~~")
        val score = 124

        println("score")
        println("$score")
        println("score = $score")
        println("${score + score}")
        println(124)
        /*
        Expected Output:
        score
        12.3
        score = 12.3
        24.6
        12.3
         */
    }
}