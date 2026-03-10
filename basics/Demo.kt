package basics

fun main(args: Array<String>) {

    print(hello(5,  primeCheck))
}

inline fun hello(n:Int, pri:(Int)->Boolean): Boolean{
    return pri(n)
}

var primeCheck : (Int)->Boolean = r@ {num->
    if(num<=2) return@r false
    else {
        for(i in 2 until num){
            if(num%i==0)
                return@r false
        }
        return@r true
    }
}