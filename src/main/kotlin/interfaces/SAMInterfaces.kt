package interfaces

import java.util.function.IntPredicate

fun interface SAMInterfaces {
    fun accept(i: Int): Boolean
}

/*If you don't use a SAM conversion, you will need to write code like this:
* */
// Creating an instance of a class
val isEven = object : SAMInterfaces {
    override fun accept(i: Int): Boolean {
        return i % 2 == 0
    }

    // Creating an instance using lambda
    val isEven = IntPredicate { it % 2 == 0 }


}

fun main() {
    println("Is 7 even? - ${isEven.accept(7)}")
}