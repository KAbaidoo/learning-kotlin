package interfaces

/*
* nterfaces in Kotlin can contain declarations of abstract methods, as well as method implementations.
* What makes them different from abstract classes is that interfaces cannot store state.
* They can have properties, but these need to be abstract or provide accessor implementations*/

interface MyInterface {
    /*
    * You can declare properties in interfaces.
    * A property declared in an interface can either be abstract or provide implementations for accessors.
    * Properties declared in interfaces can't have backing fields, and therefore accessors
    * declared in interfaces can't reference them:*/
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo(){
        print(prop)
    }

    fun bar()
}

class Child:MyInterface{
    override val prop: Int = 29

    override fun bar() {
        TODO("Not yet implemented")
    }


}