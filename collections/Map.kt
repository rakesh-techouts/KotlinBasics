package collections

fun main(args: Array<String>) {
    val mutableMap = mutableMapOf(1 to "Raj", 2 to "Ram", 3 to "Sita")

    mutableMap[1] = "Laxman"
    mutableMap[4] = "Ravan"
    for (value in mutableMap.values) {
        println(value)
    }
    for((key, value) in mutableMap) {
        println("$key -> $value")
    }
    val immutableMap = mapOf(1 to "Ram", 2 to "Raj", 3 to "Sita")
    // immutableMap[4] = "Laxman"   does not allow
    for (key in immutableMap.keys) {
        println(immutableMap[key])
    }

    for ((key, value) in immutableMap) {
        println("$key -> $value")
    }
}