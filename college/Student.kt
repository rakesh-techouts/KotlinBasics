package college


data class Student(
    var name:String?=null,
    var rollNumber:Int=0,
    var marks:Float=0.0F,
    var faculty: Faculty?=null)

fun main(args: Array<String>) {
    var faculty = Faculty()
    faculty.name="Prashanth"

    val student1 = Student()
    student1.rollNumber = 20
    student1.faculty = faculty

    val student2 = Student()
    student2.rollNumber = 21
    student2.faculty = faculty

    faculty.students?.add(student1)
    faculty.students?.add(student2)
    println(faculty)

    val nums=10 downTo 1
    println(nums::class.simpleName) //IntRange
    for(i in nums) {
        print("$i ")
    }
}