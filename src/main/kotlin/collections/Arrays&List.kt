package collections

/*
* Array: Mutable but has Fixed Size
*
* Collections
*   Immutable Collections: Read Only Operations
*   -   Immutable List: listOf
*   -   Immutable Map: mapOf
*   -   Immutable Set: setOf
*
* Mutable Collections: Read and Write Both
*   -   Mutable List: ArrayList, arrayListOf, mutableListOf
*   -   Mutable Map: HashMap, hashMapOf, mutableMapOf
*   -   Mutable Set: mutableSetOf, hashSetOf
* */

fun main() {
//    Array Tutorial
    var myArray = Array<Int>(5) { 0 } //    Mutable , fixed Size, READ WRITE
    myArray[0] = 32
    myArray[3] = 54


   for (element in myArray){
       println(element)
   }
    for (index in 0..myArray.size-1){
        println(myArray[index])
    }

//    List
    var list = listOf<String>("Kobby","Ben","James")    //Immutable, Fixed Size, READ ONLY

//    var list1 = mutableListOf <String>()    //Mutable, No Fixed Size, Can Add or Remove
//    var list1 = ArrayList <String>()
    var list1 = arrayListOf<String>()
    list1.add("Orange")
    list1.add("Pear")
    list1.add("Mango")

//    list1.remove("Pear")
//    list1.add(1,"Banana")

    list1[1]= "Banana"  // The above can be achieved with this

    for (index in 0..list1.size-1){
        println(list1[index])
    }
}