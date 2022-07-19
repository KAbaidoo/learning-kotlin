package functions.scopeFunctions

/**
 * scope function: with
 * property 1: Refer to context object using 'this'
 * property 2: The return value is the 'lambda result'
 * */
  class Person{
    var name: String = "kobby"
    var age: Int = 30
}

fun main() {
  val person = Person()
    val ageAfterFiveYears: String = with(person){
//        property 1:
        println(name)
        println(age)
//        property 2:
        "Age after five years is   ${age + 5}"
//        age + 5
    }

    println("Age after five years is  $ageAfterFiveYears")

}