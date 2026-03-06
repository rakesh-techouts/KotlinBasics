package classes


val sum1 = { a: Int, b: Int -> a + b }
val sum2:(Int,Int)-> Int  = { a , b -> a + b}
val greet={println("Hello World")}
val lambda : String.(Int) -> String = { this+it }

fun main(args: Array<String>) {
    val result =sum1(2,3)
    val result1 = sum1.invoke(10,20)
    val result2 = sum2(3,4)

    println("The result is $result")
    println("The sum of two numbers is: $result1")
    println("The sum of two numbers is: $result2")

    println(sum1(5,7))

    greet()
    greet.invoke() //return void
    println(greet.toString()) //packagename.Filename$$Type/hexacode

    val result3 = "Geeks".lambda(50)
    print(result3)

}