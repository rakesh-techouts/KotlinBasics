package basics

fun main(args: Array<String>) {
    fun1()
    fun1.invoke()
    fun2()
    fun2.invoke()

    fun3(10,20)
    fun4.invoke(10,30)
    fun5(10,20)

    val list= listOf(1,2,3,4,5)
    list.forEach{item -> print("$item ")}; println()
    list.forEach { print("$it ")}
}

val fun5={a:Int,b:Int->a+b}  //Type inference
val fun3:(Int,Int)->Int = {x,y->x+y}
val fun4:(Int,Int)->Int={x,y->x-y}

val fun1={println("Hello World")}
var fun2=fun1

