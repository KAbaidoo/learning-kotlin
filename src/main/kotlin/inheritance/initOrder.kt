package inheritance

fun main() {
    val test = Chemistry("malaria", "RDT")

}

/*
* During the construction of a new instance of a derived class, the base class initialization is done
*  as the first step (preceded only by evaluation of the arguments for the base class constructor),
*  which means that it happens before the initialization logic of the derived class is run.
* */

open class Test(val name: String) {
    init {
        println("initializing Test class")
    }

    open val size: Int = name.length.also { println("initializing size in Test class: $it") }
}

class Chemistry(name: String, val otherName: String) :
    Test(name.replaceFirstChar { it.uppercase() }.also { println("argument for Test class: $it") }) {
    init { println("Initializing a Chemistry class") }

    override val size: Int =
        (super.size + otherName.length).also { println("Initializing size in the Chemistry class: $it") }
}