package null_safety

fun main() {
//    WAP to find out length of name

    val name: String? = "Steve"
/*
*   1. Safe Call (?.)
*   ==========================
*   Returns the length if 'name' is not null else returns NULL
*   Use it if you don't mind getting NULL value
* */

    println("The length of name is${name?.length}")

/*
*   2. Safe Call with (?.let)
*   ==========================
*   Executes the block ONLY IF name is NOT NULL
* */
    name?.let { println("The length of name is${name.length}") }
/*
*   3. Elvis-operator (?:)
*   ==========================
*   When we have a nullable reference 'name', we can say, 'if name is not null, use it
*   or use some non-null value
* */
    val len = if (name != null)
        name.length
    else
        -1

    val length = name?.length ?: -1 //    Can be written as
    println("The length of name is $length")
/*
     4. Non-null assertion operator (!!)
*   ==========================
*   Use it when you are sure the value is NOT NULL
    Throws NullPointerException if the value is found to be NULL
* */
    println("The length of name is ${name!!.length}")


}