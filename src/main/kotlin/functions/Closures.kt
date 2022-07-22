package functions



/*
*   ==============================================
*       Closures,'it' keyword, 'With' & 'Appy
*   ==============================================
*   -Closures: In Kotlin you can modify outside variables with Lambdas.
*
* */
class ProgramI {

    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) {  //High Level Function with lambda
        action(a, b)  // result = x + y = a + b = 2 + 7 = 9
    }

    fun reverseAndDispaly(str: String, myFunc: (String) -> String) {
        var result = myFunc(str)
        println(result)
    }
}


fun main() {
//    ================
//    Closures
//    ================
    /* var result = 0  //in kotlin you can modify the outside variable
     val program = ProgramI()
     program.addTwoNumbers(2, 7, { x, y -> result = x + y })
     println(result)*/


//    =================
//    'it' keyword
//    =================
    val program = ProgramI()
//    program.reveseAndDispaly("hello", {s-> s.reversed()})
    program.reverseAndDispaly("hello", { it.reversed() }) // when the parameter is only one we can use only 'it'
    // 'it' is the implicit name for the single parameter

//    =================
//    'with'
//    =================
    var person = Person()
    with(person) {
        name = "Kobby"
        age = 23
    }

    person.apply {//apply returns a receiver which is 'person'
        name = "Kobby"
        age = 23
    }.startRun()     //apply has the ability to call functions inside the Person class

    println(person.name)
    println(person.age)


}

class Person {
    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("I am running")
    }
}