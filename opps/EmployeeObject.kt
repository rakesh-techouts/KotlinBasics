package opps

fun main(args: Array<String>) {
    var employee1 = Employee() // creates object of java class Automatically
    employee1.name="Rakesh" // calls setters
    employee1.age=22
    println(employee1) // calls employee toString() if not present print hashCode
    println("Name: ${employee1.name}  Age: ${employee1.age}") // calls getters


    var employee2 = Employee("Ajay",56)
    println(employee2)
    println("Name: ${employee2.name}  Age: ${employee2.age}")
}