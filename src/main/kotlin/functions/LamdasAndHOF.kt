package functions.scopeFunctions

/*
*   -   High Order Functions are functions that accept other functions as input, output or both
*   -
* */

class Program {
//    fun addTwoNumbers ( a:Int, b:Int, action: IExecutor)  { //HOF with Interface as a parameter
//        val sum = a + b
//        action.execute(sum)
//    }

    fun addTwoNumbers (a:Int, b:Int, action: (Int, Int) -> Int)  {
        val result = action(a,b)
        println(result)
    }

    fun addTwoNumbers (a:Int, b:Int, action: (Int) -> Unit)  {
        val sum = a + b
        action(sum)
    }


}

interface IExecutor {
    fun execute (sum: Int)
}

fun main() {
    val program = Program()
//    program.addTwoNumbers(3,6,object : IExecutor{
//        override fun execute(sum: Int) {
//            println(sum)
//        }
//
//    })

//    val myLambda: (Int,Int)-> Int = { x: Int, y: Int -> x + y} //    A lambda expression doesn't have a name
    val myLambda: (Int)-> Unit = { s: Int -> println(s) } //    A lambda expression doesn't have a name
    program.addTwoNumbers(4,6,myLambda)
}




