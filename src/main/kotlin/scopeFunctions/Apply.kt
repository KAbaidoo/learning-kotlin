package scopeFunctions

/**
 * scope function: apply
 * property 1: Refer to context object using 'this'
 * property 2: Returns the context object itself
 * */


class Person1 {
    var name: String = ""
    var age: Int = 0
}

fun main() {

    /*
    val person = Person1()
    person.name ="Kobby" //code redundancy (person)
    person.age = 30
    */

    val person = Person1().apply {
        this.name = "Kobby"
        this.age = 30
    }

   with(person){
       println(person.name)
       println(person.age)
   }
}