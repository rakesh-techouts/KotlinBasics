package classes

//data provide all the getters() setters() toString() hashCode() equals() and componentN()
//but the fields are not private
data class Student(val name: String, val rollNumber: Int, val marks: Float)

//Setting the fields as private
class Faculty(
    private var _name:String,
    private var _department: String
) {
    var name: String
    get() = _name
    set(value) {
        _name = value
    }
    var department: String
    get() = _department
    set(value) {
        _department = value
    }
}

fun main(args: Array<String>) {
    val students=listOf(
        Student("Rakesh",523,56.77f),
        Student("Tanveer",509,99.89f),
        Student("Ganesh",507,89.99f),
        Student("Manoj",654,78.98f)
    )
    print(students)

    for (student in students) {
        println(student.name)
    }

    for(student in students){
        println("HashCode: ${student.hashCode()} ")
    }
}