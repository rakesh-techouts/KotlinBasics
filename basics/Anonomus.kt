package basics

fun main(args: Array<String>) {
    println(add.invoke(10,20))
    println(sub(10,30))

    infix fun Int.add(value: Int): Int = this + value
    val result = 5 add 10
    println(result)

    val sub=fun(a:Int,b:Int)=if(a>0 && b>0) a+b else a*b //anonymous function

    println(sub(10,20))
    println(10.plus(20))
}

val add= fun(a:Int ,b:Int)=a+b
val sub=fun(a:Int,b:Int): Int{
    return a-b
}