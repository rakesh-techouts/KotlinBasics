package basics

fun main(args: Array<String>) {
    //passing the lambda expression as argument
    println(cal(10,20){x,y->x*y})
    println(cal(10,20){x,y->x+y})
    println(cal(10,20){x,y->x-y})
    println(cal(10,20){x,y->x/y})
    println(cal(10,20){x,y->x%y})


    greet()
    greet("Rakesh")
    greet("Rakesh")
    greet(age=45,name="Rakesh") //named parameters


}



fun cal(x:Int , y:Int ,opt:(Int,Int)->Int): Int {
    return opt(x,y)
}
//method over loading
fun greet() = println("Hello Broh")
fun greet(name:String) = println("Hello $name")
fun greet(name:String,age:Int=0)= println("Hello $name,$age")
