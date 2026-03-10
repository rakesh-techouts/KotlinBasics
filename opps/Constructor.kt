package opps

class Person {

    constructor(empId: Int, empName: String) {
        println("Person id is: $empId, Person name: $empName")
    }

    constructor(empId: Int, empName: String, salary: Double) {
        println("Person id is: $empId, Person name: $empName, Salary: $salary")
    }
    constructor(){
        println("Person constructor")
    }

}
fun main(args: Array<String>) {
    val e1 = Person(18018, "Salonika")
    val e2 = Person(11011, "Parveen", 600000.5)
    val e3 = Person()
}