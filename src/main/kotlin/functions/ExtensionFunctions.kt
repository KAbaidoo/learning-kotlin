package functions

/*Kotlin provides the ability to extend a class or an interface with new functionality*/

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

/*
The 'this' keyword inside an extension function corresponds to the receiver object
(the one that is passed before the dot).
Now, you can call such a function on any MutableList<Int>:
*
* */


fun main() {
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2) // 'this' inside 'swap()' will hold the value of 'list'
}