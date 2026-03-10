package opps


open class Animal(var name: String) {
    fun eat(): Unit{
        println("$name eating")
    }
    fun sleep(): Unit{
        println("$name sleeping")
    }
}
class Dog(name: String) : Animal(name) {
    fun makeSound(): String{
        return "$name making Bow Bow"
    }
}
//class smallDog(name: String) : Dog(name){}  Dog should be in open

class Cat(name: String) : Animal(name){
    fun makeSound(): String{
        return "$name making Meow Meow"
    }
}

fun main(args: Array<String>) {
    var animal: Animal = Dog("Dog")
    animal.eat()
    animal.sleep()
    // animal.makeSound()  does not work

    var animal1 = Dog("Dog")
    animal1.makeSound()
    animal1.eat()
    animal.sleep()

    var animal2=Cat("Cat")
    animal2.makeSound()
    animal2.eat()
    animal2.sleep()

    val wd = WebDeveloper("Rakesh", 25, 10000)
    wd.website()
    val ad = AndroidDeveloper("Ganesh", 24,12000)
    ad.android()
    val iosd = IosDeveloper("Praveen", 26,15000)
    iosd.iosapp()


    var bike = Lorry("Pulser")
    bike.start()
    bike.appliedBreaks()
    bike.stop()

    val s = Square()
    s.draw()

}
open class Shape{
    open fun draw(){
        println("Drawing shape")
    }
}
//parent
open class Rectangle:Shape(){
    override fun draw(){
        println("Drawing rectangle")
    }
}

class Square:Rectangle(){
    override fun draw(){
        println("Drawing square")
    }
}

//parent
open  class Employeee( name: String,age: Int,salary : Int) {
    init {
        println("My name is $name, $age years old and earning $salary per month. ")
    }
}

class WebDeveloper( name: String,age: Int,salary : Int): Employeee(name, age,salary) {
    init {
        println("initializing website")
    }
    fun website() {
        println("I am website developer")
        println()
    }
}

class AndroidDeveloper( name: String,age: Int,salary : Int): Employeee(name, age,salary) {
    init {
        println("Initializing android")
    }
    fun android() {
        println("I am android app developer")
        println()
    }
}

class IosDeveloper( name: String,age: Int,salary : Int): Employeee(name, age,salary) {
    init {
        println("Initializing ios")
    }
    fun iosapp() {
        println("I am iOS app developer")
        println()
    }
}

//parent
open class Vechile {
    open var name: String=""
    open var numberOfWheels:Int=0
    init {
        println("Initializing Vechile")
    }
    constructor(name: String, numberOfWheels: Int) {
        this.name = name
        this.numberOfWheels = numberOfWheels
    }

    fun start(){
        println("$name is Started")
    }
    fun stop() {
        println("$name is Stopped")
    }
}

class Lorry : Vechile {
    constructor(name: String) : super(name,2) {
        println("$name is Bike")
    }
    fun appliedBreaks() {
        println("$name is appliedBreaks")
    }
}
