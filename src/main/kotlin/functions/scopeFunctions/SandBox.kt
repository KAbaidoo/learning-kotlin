package functions.scopeFunctions


class Car {
    var brand : String? = ""
    var topSpeed : Int? = 0
}

fun main() {
    /*
* ==============================
*       scope function apply()
* ==============================
* */
//    Used to configure an object
    val myCar = Car().apply {
        brand = "Toyota"
        topSpeed = 80
    }

    with(myCar){
        println("Brand is $brand")
        println("Top Speed is $topSpeed")
    }


/*
* ==============================
*       scope function with()
* ==============================
* */

//    val myCar = Car()
//    val carTopSpeed: String = with(myCar){
//        property 1:
//        println("The car is a $brand")

//        property 2: returns the 'lambda result'
//        "The top speed is $topSpeed"
//    }
//    println(carTopSpeed)

}