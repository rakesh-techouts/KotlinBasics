package basics


fun main(args: Array<String>) {
    var list=listOf(1,2,3,3,4,5,6,7,7,8,9,10)
    println(list)
    println(list::class.simpleName)//ArrayList
    println(list[0]::class.simpleName)//Int
    for(i in list){
        print("$i ")
    }
    println()
    for(i in list){
        print("${i+8} ")
    }
    println()
    var a=9
    var result=when{
        a>9->"Greater than 9"
        a in 1..9-> "Less than 10"
        else -> "illegal Option"
    }
    println(result)

    var arr=arrayOf<Any>(1,2.0,8.7f,3,4.8f,5,6f,7.7f,8f,9.7f,10f,"Hello")
    println(arr::class.simpleName)
    println(arr[0]::class.simpleName)
    println(arr[1]::class.simpleName)
    println(arr[2]::class.simpleName)
    println(arr[arr.lastIndex]::class.simpleName)
    println(arr.size)

    for(i in arr){
        print("$i ")
    }
    println()

    for(i in 0 until arr.size){
        print(arr[i])
    }
    println()
    arr.forEach { println("$it  ") }
    arr.forEachIndexed { index, any ->  println("index=$index Value=$any") }

    var iterator = arr.iterator()
    while(iterator.hasNext()) {
        print("${iterator.next()}  ")
    }
}