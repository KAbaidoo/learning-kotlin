package functions.scopeFunctions

/**
 * scope function: also - mainly when we want to perform additional operations on an object after init
 * property 1: Refer to context object using 'it'
 * property 2: Returns the context object itself
 * */

fun main() {
    val numbersList: MutableList<Int> = mutableListOf(2, 4, 6)

    val duplicateNumbers = numbersList.also {
        println("The elements in the list are $it")
        it.add(7)
        println("The elements in the list after adding 7 are $it")
        it.remove(4)
        println("The elements in the list after removing 4  are $it")
    }
    println("Final elements in the list are $duplicateNumbers")

}