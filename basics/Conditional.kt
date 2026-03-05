package basics

fun main(args: Array<String>) {
    var  num1=20
    var num2=39

    var big=if (num1>num2) num1 else num2
    println("Bigger Number is $big")

    var num3=10 // if work as expression
    var small=if(num1<num2 && num1<num3) num1
            else if(num2<num1 && num1<num3) num2
            else num3
    println("Smaller Number is $small")
    // if as a block
    var age=35
    if(age<=12)
        println("Your Age is $age so, Your are Child")
    else if (age>12 && age<20)
        println("Your Age is $age so, Your are Teen")
    else if(age>=20 && age<=39)
        println("Your Age is $age so, Your are Adult")
    else
        println("Your Age is $age so, Your are Senior")


    //switch in range
    when(age) {
         in 1..12-> println("Your Age is $age so, Your are Child")
         in 13..19-> println("Your Age is $age so, Your are Teen")
         in 20..39 -> println("Your Age is $age so, Your are Adult")
         else -> println("Your Age is $age so, Your are Senior")
    }

    //No Arbitrary element
    when {
        age<=12 && age>0-> println("Your Age is $age so, Your are Child")
        age in 13..19 -> println("Your Age is $age so, Your are Teen")
        age in 20 until 40 -> println("Your Age is $age so, Your are Adult")
        else -> println("Your Age is $age so, Your are Senior")
    }

    //switch if matches
    when(5) {
        1-> println("Its Monday we have to Work")
        2-> println("Its Tuesday we have to Work")
        3-> println("Its Wednesday we have to Work")
        4-> println("Its Thursday we have to Work")
        5-> println("Its Friday we have to Work")
        6,7,5-> println("No Work Enjoy") //multi matches
        else-> println("Nothing to do")
    }
}