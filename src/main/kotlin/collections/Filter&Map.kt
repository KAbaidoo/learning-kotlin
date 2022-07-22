package collections
/*
* FILTER
* Returns a list containing only the matching the given [predicate]
* predicate is a condition that returns a boolean value
* */

/* MAP
* Returns a list containing the result of applying the given [transform] function
* to each element in the original collection
* */

fun main() {
    val myNumbers = listOf<Int>(2, 4, 5, 1, 0, 8)
    val smallNumbers = myNumbers.filter { v -> v < 5 } // OR {it < 5}
    println("Small numbers")
    for (num in smallNumbers) {
        println(num)
    }

    val mySquaredNums = myNumbers.map { num -> num * num }  // OR {it * it}
    println("Squared numbers")
    for (num in mySquaredNums) {
        println(num)
    }

    val smallSquareNums = myNumbers.filter { it < 5 }.map { it * it }
    println("Small squared numbers")
    for (num in smallSquareNums) {
        println(num)
    }

    var people = listOf<Person>(Person(12, "Kobby"), Person(14, "James"), Person(13, "Jamie"))
    var names = people.filter { it.name.startsWith("J") }
                        .map { it.name }
    for (name in names) {
        println(name)
    }
}

private class Person(var age: Int, var name: String) {

}
