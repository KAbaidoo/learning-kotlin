package null_safety

/*
        late init
        ============
*   -   Used only with mutable data type
*   -   Used only with non-nullable datatype
*   -   Values must be initialized before you use it
*
*/

fun main() {
    val country = Country()
    country.setup()
}

class Country {
    lateinit var name: String

    fun setup(){
        name = "USA"
        println("The name of the country is $name")
    }
}
