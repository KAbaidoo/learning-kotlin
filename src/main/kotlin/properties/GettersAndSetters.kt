package properties



fun main() {
   val area = Area(10, 5)
    println("area is ${area.area}")

    area.also {
       it.width = 30
        println("new area ${area.area}")
    }
}
/*
* You can define custom accessors for a property.
* If you define a custom getter, it will be called every time you access the property
* */

class Rectangle(val width: Int, val height: Int) {
    //    a custom getter
    val area: Int get() = this.width * this.height
}

/*
*  custom setter
* */
class Area(width: Int, val height: Int) {
    var width: Int = width
        set(value) {
            field = value * 10
        }
    //    a custom getter
    val area: Int  get() = this.width * this.height
}
