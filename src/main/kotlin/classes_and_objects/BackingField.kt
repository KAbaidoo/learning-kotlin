package classes_and_objects



class Sale(val product:String,val price:Int , val qty: Int) {
var discount = 0
    set(value) {
        if(qty > 1)
            field = value
    }

    var amount = 0
    get() {
        val total = price * qty
        return total - (total * discount/100)
    }
}

fun main() {
    val sale = Sale("Game Boy",50,  6)

    with(sale){
        discount = 2
        println("The total amount for $qty $product is $amount including discount of $discount %")
    }
}