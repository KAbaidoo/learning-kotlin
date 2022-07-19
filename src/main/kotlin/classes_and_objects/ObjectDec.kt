package classes_and_objects

/*
    - Kotlin 'object'  declaration. It is an alternative to STATIC in Java
    - we cannot declare static variables and methods in kotlin
        . when we declare 'object' kotlin creates a singleton object internally
    - Singleton: when we have just one instance of a class in the whole application
 */


/*
*   Case using classes
* */
//class CustomerData {
//    var count:Int = -1
//
//    fun typeOfCustomer():String {
//        return "Paying"
//    }
//}

object CustomerData {
// can also inherit from some super class and implement methods
//    we can add init blocks inside
//    we cannot constructors

    var count:Int = -1

    fun typeOfCustomer():String {
        return "Paying"
    }
}
fun main() {
 //   case using classes
//    var customerData =CustomerData()
//    customerData.count
//    customerData.typeOfCustomer()


    CustomerData.count  //  behaves like a STATIC variable
    CustomerData.typeOfCustomer()   //  behaves like a STATIC method
    println(CustomerData.count)

    CustomerData.count = 30 // you can update the values in the object created
    println(CustomerData.count)
}