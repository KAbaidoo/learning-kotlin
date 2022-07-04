package scopeFunctions

fun main() {

    /**
     * scope function: let
     * property 1: Refer to context object using 'it'
     * property 2: Return value is the 'lambda result'
     * */

//  use 'let' function to avoid NullPointerException
    val name: String? = "hello"

//'?.' is safe call operator
    val stringLength = name?.let {
        println(it.reversed())
        println(it.capitalize())
        it.length
    }

    println(stringLength)


}