package modifiers
/*
* interfaces can contain NORMAL and AbSTRUCT methods
* but contain only ABSTRACT properties
* they are NOT classes
* you cannot create instance of interface similar to ABSTRACT classes
* only provides a short term service e.g. button click, check box
* */

interface MySecondInterface {     //

    fun onTouch()  // methods in interfaces are abstract by default

    fun onClick(){   //normal methods are public and open by default NOT FINAL
        // some code
        println("onClick Interface code : Button Clicked")
    }
}
interface MyInterfaceListener {     //you cannot create instance of interface
   // var name:String //every declaration in interfaces is abstract and open

     fun onTouch() {
         println("MyInterfaceListener: onTouch")
     }

     fun onClick(){   //normal methods are public and open by default NOT FINAL
        // some code
         println(" MyInterfaceListener: onClick")
    }
}


class MyButton: MyInterfaceListener, MySecondInterface {
    //    override var name: String = "button name"
//
//    override fun onTouch() {
//        println("button was touched")
//    }
//
//    override fun onClick() {  // optional overriding
//        super.onClick()
//        println("button was clicked")
//    }

    override fun onClick() {
//        when inherating from two different interfaces with the same name, qualify super<'interface name'>
        super<MyInterfaceListener>.onClick()
        super<MySecondInterface>.onClick()
    }

    override fun onTouch() {

    }



}

fun main() {
    val myBtn = MyButton()
    myBtn.onTouch()
    myBtn.onClick()
}