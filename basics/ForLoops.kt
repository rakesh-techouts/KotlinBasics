package basics

fun main() {
    /*for with inclusive */
    println("For with Inclusive(1 to 10 )")
    for (i in 1..10) {
        print("$i  ")
    }
    println()
    //for with downTo
    println("For with downTo (10 to 1)")
    for (i in 10 downTo 1) {
        print("$i  ")
    }
    println()
    //for with downTo step(skips)
    println("For with downTo step 2 (10 to 1)")
    for (i in 10 downTo 1 step 2) {
        print("$i  ")
    }
    println()
    println("For with Exclusive last(1 to 10)")
    for (i in 1 until 10 ) {
        print("$i  ")
    }
    println()
    println("For with Exclusive last(1 to 10)")
    for (i in 1..<10) {
        print("$i  ")
    }
}