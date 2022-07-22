package collections
// A Set contains unique elements
// HashSet also contains unique elements but the sequence is not guaranteed in output


fun main() {
    var mySet = setOf<Int>(2,7,24,6,34,88)  //Immutable READ only
    var myHashSet = hashSetOf<Int>(2,7,24,6,34,88) //Sequence not guaranteed

    var mutableSet = mutableSetOf<Int>(2,7,24,6,34,88)  //Mutable Set. READ and WRITE
    mutableSet.remove(24)
    mutableSet.add(50)

    for (element in mutableSet){
        println(element)
    }
}

