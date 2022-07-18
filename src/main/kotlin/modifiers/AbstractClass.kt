package modifiers
abstract class LivingThing{
    open var type:String = ""   //normal property can be overridden
    abstract var name:String   //abstract property cannot be instantiated


    open fun reproduce(){ // an 'open' function can be overridden

    }
    fun grow(){ // a normal fun is public and final by default

    }
    abstract fun move() //abstract fun doesn't have any body



}


class Plant : LivingThing(){       //subclass or derived class
    override var type: String = "plant"
    override var name: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun reproduce() {
    }

    override fun move() {
        TODO("Not yet implemented")
    }

}

