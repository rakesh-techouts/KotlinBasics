package basics

import java.util.TreeMap

fun main(a : Array<String>)  {
    var map= TreeMap<String, String>()
    map.put("key","value")
    map.put("key2","key3")
    map.put("key3","key4")
    for((key,value) in map) {
        println("$key  $value")
    }

    var Str1: String?  = null
    println(Str1?.length)

    var num=10 //it is convert as Int
    println(num)
    println(num::class.simpleName) //prints the type of variable

    //num= String "Hello world"  not possible to caste int as String

    //for with inclusive
    for (i in 1..10) {
        print("$i  ")
    }

    println()
    for(i in 10 downTo 1) {
        print("$i  ")
    }


    var str: String?=null
    println(str?.length)
}