package inheritance

fun main() {
    val myCar = Sedan("Sedan",  "Mercedes-Benz" )
    with(myCar){
        println("Its a $type $brand ")
    }
}

open class Car(var type: String) {

}

class Sedan(var brand: String, type: String) : Car(type) {

}
