package basics

fun main(ars: Array<String>) {
    //Structural Equality
    var s1="Rakesh"
    var s2="Rakesh"
    println("${s1::class.simpleName}   ${s2::class.simpleName}")
    println(s1.hashCode())
    println(s2.hashCode())
    println(s1+s2)// concatenation
    //when the Structure is same reference also same
    println(s1==s2) // Structural Equality
    println(s1===s2) //reference equality
    println(s1.equals(s2)) //Structural



    var num=10
    var nu=11
    println(num==nu) //fasle
    println(num===nu)//false
    println(num.equals(nu)) //false

    //methods in Int class
    println("Add: ${num.plus(nu)}")
    println("Sub: ${num.minus(nu)}")
    println("Multiply: ${num.times(nu)}")
    println("Divide: ${num.div(nu)}")
    println("Mod: ${num.mod(nu)}")

    //General Operators
    println("Add: ${num+nu}")
    println("Sub: ${num-nu}")
    println("Multiply: ${num*nu}")
    println("Divide: ${num/nu}")
    println("Mod: ${num%nu}")

    var a: Int=10
    var b: Int=11
    println(a.equals(b))
    println(a==b)
    println(a===b)

}
