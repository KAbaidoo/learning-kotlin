package classes_and_objects

/*
all classes and methods in kotlin are public and final by default
modifiers for top-level functions are public, internal and private
* */
fun run() {

}

open class Person {  // super class
    private val a = 1
    protected val b = 2
    internal val c = 3
    val d = 3

}

class Ghanaian : Person() { //  derived class
//    a is not visible
//    b, c, d is visible

    fun test() {
        println(b)
    }
}

class TestClass {
    //    protected makes visible to subclasses and not to classes which have nothing to do with it
//    therefore person.a and person.b are not visible
    fun test() {
        val person = Person()
        println(
            person.c
        )
    }
}
