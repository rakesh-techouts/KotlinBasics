package interfaces

class Bike(var name: String) : Vechile {
    val numberOfWheels: Int=2
    override fun start() {
        println("$name started")
    }

    override fun appliesBreaks() {
        println("$name applies breaks")
    }

    override fun stop() {
        println("$name stopped")
    }
    fun numberOfWheels() {
        println("$numberOfWheels wheels does $name have")
    }
}