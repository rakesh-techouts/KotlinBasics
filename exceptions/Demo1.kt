package exceptions
import java.util.Scanner
fun main(args: Array<String>) {
    //manualException()

    try{
        var a=10
        println(a/0)
    }catch(e : Exception){
        println(e.message)
    }

    println(test(10, 2))
    println(test(10, 0))
    tryWithFinally()
    tryWithMultiCatch()
    tryWithMultiCatchUsingWhen()

    print("Hello World!")
    println(test(10, 20))
}


fun tryWithMultiCatchUsingWhen() {
    try {
        val scanner = Scanner(System.`in`)
        println("Enter the number you want to continue:")
        val num = scanner.nextInt()

        val result = 100 / num
        println("Result: $result")

    } catch (e: Exception) {
        when (e) {
            is NumberFormatException -> println("Number Format Exception")
            is ArithmeticException -> println("Arithmetic Exception: Divide by zero")
            else -> println("Some other exception occurred: ${e.message}")
        }
    }
}
fun tryWithMultiCatch() {
    try{
        println(10/0)
        var arr=arrayOf(1,2,3,4)
        println(arr[8])
    }catch(e : ArrayIndexOutOfBoundsException){
        println("catch of ArrayIndexOutOfBoundsException")
        println(e.message)
    }catch(e : ArithmeticException){
        println("Arithmetic exception")
        println(e.message)
    }catch(e : Exception){
        println("I am tryWithMultiCatch")
        println(e.message)
    }finally {
        println("Finally")
    }
}
fun tryWithFinally() {
    try{
        var a=10
        println(a/10)
    }finally {
        println("finally")
    }
}




fun test(a: Int, b: Int): Int {
    return  try {
        a / b
    } catch (e: ArithmeticException) {
        println(e.message)
        println("Divide by zero not allowed")
        0
    }finally {
        println("end of test")
    }
}

fun manualException() {
    var a=10
    println(a/0)
}
