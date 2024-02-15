package flow

/**
 * Basic 'for' code demonstrations in the Kotlin language
 * <p>
 *     The following code samples are borrowed from Prgramiz
 *     with the sole intent to demonstrate basic usage of 'for' loops in the Kotlin
 *     language. Samples have been modified.
 * </p>
 * @see <a href="https://www.programiz.com/kotlin-programming/for-loop">Programiz</a>
 * @author Clark Rodriguez
 */
class ForDemo {

    fun rangedFor(){
        println("~~RANGED-FOR DEMO~~")

        //Note: can be done in one-line fashion
        for (i in 1..5){
            println(i)
        }

        /*
        Expected Output:
        1
        2
        3
        4
        5
         */
    }

    fun rangedForComparison(){
        println("~~RANGED-FOR COMPARISONS~~")

        print("for (i in 1..5) print(i) = ")
        for (i in 1..5) print(i)

        println()

        print("for (i in 5..1) print(i) = ")
        for (i in 5..1) print(i)             // prints nothing

        println()

        print("for (i in 5 downTo 1) print(i) = ")
        for (i in 5 downTo 1) print(i)

        println()

        print("for (i in 1..5 step 2) print(i) = ")
        for (i in 1..5 step 2) print(i)

        println()

        print("for (i in 5 downTo 1 step 2) print(i) = ")
        for (i in 5 downTo 1 step 2) print(i)

        /*
        Expected Output:

        for (i in 1..5) print(i) = 12345
        for (i in 5..1) print(i) =
        for (i in 5 downTo 1) print(i) = 54321
        for (i in 1..5 step 2) print(i) = 135
        for (i in 5 downTo 1 step 2) print(i) = 531
         */
    }

    fun forArray(){
        println("~~FOR ARRAY DEMO~~")
        var demoArray = arrayOf("Augustus", "Clark", "Raphael", "P.", "Rodriguez")

        for(item in demoArray) println(item)

        /*
        Expected Output:
        Augustus
        Clark
        Raphael
        P.
        Rodriguez
         */
    }

    fun forIndexedArray(){
        println("~~FOR ARRAY INDICES DEMO~~")
        var demoArr2 = arrayOf("North","South", "East", "West")

        for(item in demoArr2.indices){
            if(item%2 == 0) println(demoArr2[item])
        }
        //.indices returns indices of array elements.

        /*
        Expected Output:
        North
        East
         */
    }

    fun forString(){
        println("~~FOR STRING DEMO~~")
        var text = "Bacteria"

        for (letter in text) println(letter)

        /*
        Expected Output:
        B
        a
        c
        t
        e
        r
        i
        a
         */
    }

    fun forIndexedString(){
        println("~~FOR STRING INDICES DEMO~~")
        var text = "Bacteria"

        for (item in text.indices) println(text[item])
        /*
        Expected Output:
        B
        a
        c
        t
        e
        r
        i
        a
         */
    }

}