package classes_and_objects


/*
* object expression is a way of creating objects from anonymous classes
* anonymous objects can inherit and can also be returned and a value type
* */
fun main() {

    val message = object {
        val hello = "Hello"
        val world = "World"

        fun greet() = println("$hello $world")
    }

    message.greet()
}