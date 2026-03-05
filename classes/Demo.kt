package classes

class Demo {
    private var name:String=""
    //paramerised Constructor
    constructor(name:String) {
        this.name= name
    }
    //default constructor
    constructor(){ }
    fun main()  {
        println("Hello World $name")
    }
    fun setName(name:String){
        this.name=name
    }
    fun getName():String{
        return name
    }

}

fun main(args: Array<String>) {
    var demo = Demo("Rakesh")
    demo.main()
    var demo1=Demo()
    demo.setName("Manoj")
    demo.main()
}