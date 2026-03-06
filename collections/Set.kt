package collections

fun main() {
    val immutableSet = setOf(6, 9, 9, 0, 0)

    for (item in immutableSet) {
        println(item)
    }
    val mutableSet = mutableSetOf(6, 10)
    mutableSet.add(2)
    mutableSet.add(5)
    mutableSet.add(6) //not added duplicate

    for (item in mutableSet) {
        println(item)
    }
}