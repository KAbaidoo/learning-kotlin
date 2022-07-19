package classes_and_objects

//enum class CreditCardType {
//    SILVER,     //  ordinal = 0     name="SILVER"
//    GOLD,      //   ordinal = 1     name="GOLD"
//    PLATINUM    //  ordinal = 2     name="PLATINUM"
//}
//
//fun main() {
//
//
/*   - Enum objects are constant values. Once created they cannot be changed
     - Each enum constant is a separate instance of the enum class
     - Enum class can implement interfaces. But cannot inherit from abstract classes or open classes
     - You can use enum constants as anonymous classes - assignment
 */

//    val userCreditCardType = CreditCardType.GOLD
//
//    /*  Each enum object has two properties: ordinal and name  */
//    println(CreditCardType.GOLD.ordinal)
//    println(CreditCardType.GOLD.name)
//
//    /*  Each enum object has methods: values() and valuesOf() */
//    val myConstants: Array<CreditCardType> = CreditCardType.values()
//    myConstants.forEach { println(it) }
//
//    /* Using in 'when' statement */
//    when(userCreditCardType){
//        CreditCardType.SILVER -> println("User has Silver card")
//        CreditCardType.GOLD -> println("User has Gold card")
//        CreditCardType.PLATINUM -> println("User has Platinum card")
//    }
//
//}

interface ICardCashBack {
    fun getCashBackValue(): Float
}
/*
*   You can add addition properties to Enums by use of a constructor
* */
enum class CreditCardType (val color: String, val maxLimit: Int = 10000):ICardCashBack{
    SILVER("grey",5000) {     //  ordinal = 0     name="SILVER"
        override fun getCashBackValue(): Float = 0.02f
    },
    GOLD("gold") {      //   ordinal = 1     name="GOLD"
        override fun getCashBackValue(): Float = 0.04f
    },
    PLATINUM("black") {    //  ordinal = 2     name="PLATINUM"
        override fun getCashBackValue(): Float = 0.06f
    }
}

fun main() {
    println(CreditCardType.GOLD.color)
    println(CreditCardType.GOLD.getCashBackValue())
}