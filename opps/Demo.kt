package opps

import java.util.Scanner


data class Demoo(
    var name: String? = null,
    var rollNumber: Int=0,
)
fun main(args: Array<String>){
    var demo = Demoo("Rakesh",512)
    println(demo) //calls toString()

    var demo1=Demoo()
    demo1.name = "Manoj"
    println(demo1)

    //Dynamic input from the user using Scanner class
    val scanner= Scanner(System.`in`)
    println("Enter your name:")
    val name = scanner.nextLine()
    println("Enter your roll number:")
    val roll = scanner.nextInt()
    println("Name: $name RollNumber: $roll")

    //Dynamic input from the user with-out using the Scanner class
    //using readLine() it takes any input as String
    println("Enter your Age")
    val age = readLine()!!.toInt()
    println("Enter your roll number")
    val roll2 = readLine()!!.toFloat()
    println("Entered Age: $age")
    println("Entered roll number: $roll2")
}