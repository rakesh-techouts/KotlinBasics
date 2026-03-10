package opps

class Student(var name: String, var age: Int) {
        var id:Int=0

        override fun toString(): String {
            return "Student(name='$name', age=$age , id=$id)"
        }
        constructor(id: Int, name: String, age:Int) : this(name,age) {
            this.id = id
        }
}
fun main(args: Array<String>) {
    val students=  listOf(
        Student("Rakesh", 523),
        Student("manoj", 123),
        Student("Ganesh", 546)
    )
    println(students)

    val student=Student("Rakesh", 523)
    student.id=519
    val student1=Student(123,"Ganesh", 21)

    println(student)
    println(student1)
}