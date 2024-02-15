package io

import java.util.Scanner

/**
 * Basic Input code demonstrations in the Kotlin language
 * <p>
 *     The following code samples are borrowed from Programiz
 *     with the sole intent to demonstrate basic I/O in the Kotlin
 *     language. Samples have been modified.
 * </p>
 *
 * @see <a href="https://www.programiz.com/kotlin-programming/input-output">Programiz</a>
 * @author Clark Rodriguez
 */
class InputDemo {
    fun inputString(){
        println("~~BASIC INPUT VIA readLine()~~")
        print("Enter text: ")

        //Variable to store user input.
        val stringInput = readLine()
        println("You entered: $stringInput")

        /*
        Expected Output:
        Enter text: ____
        You entered: "____"
         */
    }

    fun inputviaScanner(){
        println("~~BASIC INPUT VIA SCANNER~~")
        print("Enter text: ")

        val inputScanner = Scanner(System.`in`)
        println("You entered: $inputScanner via Scanner.")

        /*
        Expected Output:
        Enter text: ____
        You entered: "____" via Scanner.
         */
    }

    fun inputInteger(){
        println("~~BASIC INT INPUT~~")
        val reader = Scanner(System.`in`)
        print("Enter a number: ")

        var userint: Int = reader.nextInt()

        println("You entered: $userint")

        /*
        Expected Output:
        Enter a number: ____
        You entered: "____"
         */
    }
}