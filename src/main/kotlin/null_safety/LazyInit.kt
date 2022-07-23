package null_safety


/*  -   lazy was invented to prevent unnecessary initialization of objects
*   -   variables will not initialize unless  you use it in code
*   -   variable is initialized only once. It is loaded from cache memory the next time you need it
*   -   it is thread safe
*   -   can use val or var
*   -   used for both nullable or non-nullable
* */
//val pi:Float = 3.14f    //waste of memory
val pi:Float by lazy{3.14f}     //waste of memory

fun main() {

    val area = pi * 4 * 4   //the variable is initialized only when it is called
    println("Some initial code....")
    println("Some more code....")

}