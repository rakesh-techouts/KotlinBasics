package collections

fun main(args: Array<String>) {
    var arrayList = ArrayList<Int>()
    //add
    for(i in 10..100 step 10) {
        arrayList.add(i)
    }
    println ("Elements in ArrayList: $arrayList")
    println(arrayList::class.simpleName)
    //size , remove , contains
    if(arrayList.size <= 10 && arrayList.contains(10)) {
        arrayList.remove(10)
    }
    println (arrayList)

    println("Index of 100: "+arrayList.indexOf(100))

    println(arrayList.get(0))
    println(arrayList.removeAt(0))
    println(arrayList.toList())

}