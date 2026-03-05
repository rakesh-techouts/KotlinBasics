package basics

fun main(args: Array<String>) {
    var i = 0
    while(i in 1..10) {
        print("$i  ")
    }
    println()

    var number=1298
    var count=0

    println("While")
    while(number>0) {
        count++
        number/=10
    }
    println("Count of The Digits: $count")

    println("Do While")
    do {
       print("$count  ")
       count--;
    }while(count > -2)
}