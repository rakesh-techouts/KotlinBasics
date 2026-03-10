package interfaces

fun main(args: Array<String>) {
    var car = Car1("Benz")
    car.numberOfWheels()
    car.start()
    car.appliesBreaks()
    car.stop()


    var bike = Bike("Pulser")
    bike.numberOfWheels()
    bike.start()
    bike.appliesBreaks()
    bike.stop()

    var c= C()
    println(c::class.simpleName)
    c.greet()

    var c1:A=C()
    println(c1::class.simpleName)
    c1.show()
    //c1.display() does not works because it has reference A
}

interface A {
    fun show()
    fun greet() { println("Hello from A") }
}
interface B {
    fun display()
    fun greet() { println("Hello from B") }
}
class C : A, B {
    override fun show() {
        println("This is Show")
    }

    override fun display() {
        println("This is Display")
    }

    override fun greet() {
        super<A>.greet()
        super<B>.greet()
    }
}