package exceptions

class Person {
    var age: Int = 0
        set(value) {
            if (value > 0) field = value
            else println("Age must be positive")
        }
}

fun main(args: Array<String>) {
    val p = Person()
    p.age = -5
    println(p.age)
    p.age = 30
    println(p.age)

    val obj = A()
    obj.setI(10)
    //println(obj.int)
    obj.show()
}
class A {
    private var i = 5

    fun setI(i: Int) {
        this.i = i
    }
    fun getI(): Any{
        return i
    }
    fun show() {
        println("Inside A: ${getI()}")
    }
}
