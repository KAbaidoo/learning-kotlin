package collections

/*
*   Predicates: A condition that returns TRUE or FALSE
*   -   all: Do all elements satisfy the predicate/condition?
*   -   any: Do any elements satisfy the predicate?
*   -   count: Count total elements that satisfy the predicate.
*   -   find: Returns the FIRST element that satisfy predicate
* */

fun main() {
    val myNumbers = listOf<Int>(3, 5, 12, 7, 9, 5, 2)

//    val myPredicate = { num: Int -> num > 10 } // you can replace all with this variable

    val check1: Boolean = myNumbers.all { it > 10 }  // Are all elements greater than 10?
    println(check1)

    val check2: Boolean = myNumbers.any { it > 10 }    // Does any element satisfy the predicate?
    println(check2)

    val totalCount: Int = myNumbers.count { it > 10 }   // Number of elements that satisfy the predicate.
    println(totalCount)

    val num: Int? = myNumbers.find { it > 10 }   // Number of elements that satisfy the predicate.
    println(totalCount)
}