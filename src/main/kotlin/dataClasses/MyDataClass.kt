package dataClasses

/*
It is not unusual to create classes whose main purpose is to hold data.
In such classes, some standard functionality and some utility functions
are often mechanically derivable from the data. In Kotlin, these are
called data classes and are marked with data:
* */
data class User (val name: String, val age: Int)
//fun copy(name: String = this.name, age: Int = this.age) = User(name, age)
val jack = User(name = "Jack", age = 1)
val olderJack = jack.copy(age = 2)

/*
* Component functions generated for data classes make it possible to use them in destructuring declarations:
* */
fun main() {
    val jane = User("Jane", 35)
    val (name, age) = jane
    println("$name, $age years of age") // prints "Jane, 35 years of age"
}