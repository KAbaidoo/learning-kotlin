package modifiers

/*
    companion object are similar to 'object' but declared within a class
* */

class MyClass {
    companion object  {

        var count:Int = -1  //  behaves as static

        fun typeOfCustomer():String {
            return "Paying"
        }
    }
}