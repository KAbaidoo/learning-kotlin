package inheritance

fun main() {
    val myCar = Car("Sedan", "Mercedes-Benz")
    with(myCar) {
        println("Its a $brand $type ")
}


}

//open class Vehicle(var type: String) {
//}
//Inherited construct argument must be delegated
////init blocks are executed when the object is created
//class Car(var brand: String, type: String) : Vehicle(type) {
//
//}

/*//================================================
*           when using secondary constructor
* ==================================================*/


open class Vehicle {
    var type: String = ""

//    always call the primary constructor
    constructor(type: String)  {
        this.type = type
    }
}
//properties cannot be inside secondary constructor

class Car: Vehicle {
    var brand:String = ""
//super calls the super's secondary constructor
    constructor(type: String, brand: String) :super(type){
        this.brand = brand
    }
}

