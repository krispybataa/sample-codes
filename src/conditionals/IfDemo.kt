package conditionals

/**
 * Basic IF code demonstrations in the Kotlin language
 * <p>
 *     The following code samples are borrowed from Programiz
 *     with the sole intent to demonstrate basic usage of 'if' expressions in the Kotlin
 *     language. Samples have been modified.
 * </p>
 * @see <a href="https://www.programiz.com/kotlin-programming/if-expression">Programiz</a>
 * @author Clark Rodriguez
 */
class IfDemo {

    fun traditionalIf(){
        println("~~TRADITIONAL IF DEMONSTRATION~~")
        val number = 124

        if (number > 0){
            print("+ number")
        } else {
            print("- number")
        }

        /*
        Expected output
        + number
         */
    }

    fun kotlinIf(){
        println("~~IF IN KOTLIN~~")
        val number = 124

        val result =
            if (number > 0){
                print("'result' returned: + number")
            } else {
                print("'result' returned: - number")
            }
        //Syntax revision if 'if' statement has one statement only.
        val coolerResult = if (number > 0) "oneline: + number" else "oneline: - number"

        println(result)

        println(coolerResult)

        /*
        Expected output
        'result' returned: + number
        oneline: + number
         */
    }

    fun kotlinMultiIf(){
        println("~~KOTLIN MULTI-IF~~")

        val a = 124
        val b = 23

        val max = if (a > b){
            println("$a is larger than $b.")
            println("Max variable holds value of a.")
            a
        } else {
            println("$b is larger than $a.")
            println("Max variable holds value of b.")
            b
        }

        println("max = $max")

        /*
        Expected output:
        124 is larger than 23.
        Max variable holds value of a
        max = 124
         */
    }

    fun kotlinLadderIf(){
        println("~~KOTLIN LADDER IF~~")
        val number = 0

        val result = if (number > 0)
            "+ number"
        else if(number < 0)
            "- number"
        else
            "zero"

        println("Ladder returns: $result")

        /*
        Expected Output:
        Ladder returns: zero
         */
    }

    fun kotlinNestedIf(){
        println("~~KOTLIN NESTED IF~~")

        val n1 = 124
        val n2 = 23
        val n3 = 128.1

        val max = if (n1 > n2){
            if (n1 > n3)
                n1
            else
                n3
        } else {
            if (n2 > n3)
                n2
            else
                n3
        }

        println("Max = $max")
        /*
        Expected Output:
        Max = 128.1
         */
    }



}