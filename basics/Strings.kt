package basics

fun main(args:Array<String>) {

    var s1 = "Rakeshrr"
    var s2 = "RakeshRakhi"

    println(s1.length)
    for(i in  0 until s2.length){
        print("${s2[i]}")
    }
    println()
    for(i in  s1.indices){
        println("${s2[i]}    $i")
    }
    println()
    print(s1.equals(s2)) //same as Structure Equality
    println(s1==s2)  //Structure equality
    println(s1===s2) //reference equality
    println(s1.compareTo(s2)) //


    println(s1.get(2))
    println(s1.substring(0,5)) //return String
    println(s1.subSequence(0,5)) //return CharSequence

    var str1="Hello \n Mr.Rakesh \n How \n Are You"
    println(str1)

    var str= String("Rakeshrr".toCharArray())

    println(str===s1)

    println(str.hashCode())
    println(s1.hashCode())
}