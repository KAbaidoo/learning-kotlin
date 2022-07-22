package collections


fun main() {
    //  Map Tutorial : Key-Value Pair
//    var myMap = mapOf<Int, String> (2 to "Orange", 6 to "Mango ", 8 to "Pineapple")  // Immutable, Fixed size, READ ONLY
    var myMap = HashMap<Int, String> ()  // Mutable, No Fixed size, READ & WRITE
    myMap.put(2,"Cow")
    myMap.put(4,"Goat")
    myMap.put(8,"Chicken")


    myMap.put(4,"Pig")      // Replaces 'Goat' at key 4



    for (key in myMap.keys){
        println(myMap[key ])
    }

}