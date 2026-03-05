package basics

object Hello {
    fun main() {
        a@ for (i in 1..5) {
            b@ for (j in 1..5) {
                c@ for (k in 1..5) {
                    println("$i $j")
                    if (i == 1 || i == 3) {
                        break@a
                    }
                }
            }
        }
    }
}
fun main(args : Array<String>) {
    Hello.main()


    var b1: Byte = Byte.MIN_VALUE
    var b2: Byte = Byte.MAX_VALUE
    println("Smallest byte value: " +b1)
    println("Largest byte value: " +b2)

    var S1: Short = Short.MIN_VALUE
    var S2: Short = Short.MAX_VALUE
    println("Smallest short value: " +S1)
    println("Largest short value: " +S2)

    var I1: Int = Int.MIN_VALUE
    var I2: Int = Int.MAX_VALUE
    println("Smallest integer value: " +I1)
    println("Largest integer value: " +I2)

    var L1: Long = Long.MIN_VALUE
    var L2: Long = Long.MAX_VALUE
    println("Smallest long integer value: " +L1)
    println("Largest long integer value: " +L2)

    var bool: Boolean=false
    if (10 is Int) print("Yes,true is a boolean value")
    if(bool) println("Yes,false")
    else println("Yes,true")

    println(3.inc())
}