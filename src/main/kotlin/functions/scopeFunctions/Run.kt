package functions.scopeFunctions

fun main() {
    /**
     * scope function: run
     * property 1: Refer to context object using 'this'
     * property 2: Returns the lambda result
     * */
//    the 'run' function is a combination of the 'let' and 'with' functions
//    if you want to operate on a nullable object and avoid NullPointerException then use 'run'

    val person: Person? = Person()

    val bio = person?.run {
        println(name)
        println(age)
        age + 5
        "He likes to teach in his own way"
    }
    println(bio)
}