package collections

fun main(args: Array<String>) {
    var fruits = listOf("apple", "banana", "orange", "grape")

    println("First fruit: ${fruits[0]}")
    println("Last fruit: ${fruits.last()}")
    println("First fruit: ${fruits.first()}")

    println("Size: ${fruits.size}")

    for (fruit in fruits) {
        println(fruit)
    }

    val filtered = fruits.filter { it.startsWith("a") }
    println("Filtered list: $filtered")


    println(fruits.map { it.plus("_add") })
    println(fruits) //not modified

    println(fruits.plus("Mango"))
    println(fruits) //not modified

    println(fruits)
    fruits=fruits.plus("Mango")
    println(fruits)


    val mutableList = mutableListOf("Raj", "Ram", "Sita")
    mutableList[0] = "Laxman"
    mutableList.add("Ravan")

    for (item in mutableList) {
        println(item)
    }
    val names = listOf("Gopal", "Asad", "Shubham", "Aditya", "Devarsh", "Nikhil", "Gagan")
    println("Elements in List: $names")

    println("Sorted: "+names.sorted())

    println("Reversed Order: "+names.reversed())

    println("Sorted Descending: "+names.sortedDescending())

    println("Sorted by an Condition: "+names.sortedBy { it.length })

    println("Sorted by Descending by Condition: "+names.sortedByDescending { it.length })
}