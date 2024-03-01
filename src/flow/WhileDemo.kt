package flow

/**
 * Basic 'while' code demonstrations in the Kotlin language
 * <p>
 *     The following code samples are borrowed from Programiz
 *     with the sole intent to demonstrate basic usage of 'while' loops in the Kotlin
 *     language. Samples have been modified.
 * </p>
 * @see <a href="https://www.programiz.com/kotlin-programming/while-loop">Programiz</a>
 * @author Clark Rodriguez
 */
class WhileDemo {

    fun basicWhile(){
        println("~~BASIC WHILE~~")

        var i = 1
        while (i <= 5){
            println("Line $i")
            i++
        }

        /*
        Expected Output:
        Line 1
        Line 2
        Line 3
        Line 4
        Line 5
         */
    }

    fun computeWhile(){
        println("~~WHILE NATURAL SUM~~")

        var sum = 0
        var i = 124

        while (i != 0){
            sum += i
            --i
        }

        println("Sum = $sum")

        /*
            Expected Output:
            Sum = 7750
         */
    }

    fun kotlinDoWhile(){
        println("~~DO-WHILE IN KOTLIN~~")

        var sum: Int = 0
        var input: String

        do{
            print("Enter integer: ")
            input = readLine()!!
            sum += input.toInt()
        }while (input != "0")

        println("Sum while not 0: $sum")
    }
}