package classes_and_objects
abstract class LivingThing{     //you cannot create an instance of abstract class
    open var type:String = ""   //normal property can be overridden
    abstract var name:String   //abstract property cannot be instantiated


    open fun reproduce(){ // an 'open' function can be overridden

    }
    fun grow(){ // a normal fun is public and final by default

    }
    abstract fun move() //abstract fun doesn't have anybody



}


class Plant : LivingThing(){       //subclass or derived class
    override var type: String = "plant"
    override var name: String = "name"


    override fun reproduce() {
    }

    override fun move() {
        TODO("Not yet implemented")
    }

}

fun main() {

}

