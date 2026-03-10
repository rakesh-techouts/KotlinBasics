package opps

class Car {
    var brand: String = ""
    var model: String = ""
    var year: Int = 0

    fun getInfo(): String {
        return "$brand $model, year $year"
    }
}

class Bike(var brand: String="", var model: String="", var year: Int=0) {
    lateinit var ownerName: String
    fun getInfo() {
        println("$brand $model, year $year  Owner: $ownerName")
    }
}
fun main(args: Array<String>) {
    val myCar = Car()
    myCar.brand = "Toyota"
    myCar.model = "Camry"
    myCar.year = 2020

    println(myCar.getInfo())

    var myCar2 = Car()
    myCar2.brand = "Benz"
    myCar2.model = "Memos"
    myCar2.year = 2026
    println(myCar2.getInfo())

    var myCar3 = Car()
    println(myCar3.getInfo())


    /*val bike =Bike("pulser", "150cc",2022)
    println(bike.getInfo())*/

    val bike1 = Bike()
    bike1.brand="Pulser"
    bike1.model="220CC"
    bike1.year = 2019
    bike1.ownerName="Rakesh"

    println(bike1.getInfo())

}