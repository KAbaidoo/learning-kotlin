package properties

class LateInit {
    lateinit var myProperty: String

    fun setup(){
        myProperty = "some value"
    }

    fun test(){
        if (::myProperty.isInitialized){
            println(myProperty)
        }
    }
}

fun main() {
    val obj = LateInit().also {
        it.setup()
        it.test()
    }





}