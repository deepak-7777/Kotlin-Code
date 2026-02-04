package com.example.kotlinsample

class MyClass {

                                                     // Variables  & DataType
//    companion object {
//        @JvmStatic
//        fun main (args: Array<String>) {
//            var a: Int = 7         // variables
//            var b = 77
//            var name: String = "Deepak"
//            println("Deepak $a")
//            println("Deepak " + b)
//            println("Hello $name Welcome to kotlin world")
//        }
//    }

                                                 //   val  & var
//    companion object {
//        @JvmStatic
//        fun main (args: Array<String>) {
//            var a = 7               ///  var ko override nahi kiya ja shakta hai     (value change )
//            var name = "Deepak"
//            val b = 7              ///   val ko override nahi kiya ja shakta hai    (Do not change value)
//            name = "Dev"
//            println("Deepak " + b)
//            println(name)
//        }
//    }

                        //  how to create method
//    companion object {
//        @JvmStatic
//        fun main (args: Array<String>) {
//            println("The sum is ${add(3,4, 7)}")
//        }
//        fun add(a:Int , b:Int ) : Any{                 //  (jab nahi pata ho return type tab ham 'Any' use karte hai)
//            return a+b
//        }
//       private fun add(a:Int , b:Int, c:Int) : Int{
//           return  a+b+c
//        }
//    }

                                            //   Conditionals Statement
//    companion object {
//        @JvmStatic
//        fun main (args: Array<String>) {
//            var num = 170
//            if(num>100) {
//                println("No. is Greater")
//            }else if (num < 70){
//            }
//            else {
//                println("No. is Smaller")
//            }
//        }
//    }

                                                  ///   for Each Loop
//    companion object {
//        @JvmStatic
//        fun main (args: Array<String>) {
//            var num = 0
//            val arrNo = ArrayList<Int>()
//            arrNo.add(1)
//            arrNo.add(2)
//            arrNo.add(3)
//            arrNo.add(4)
//            arrNo.add(5)
//            arrNo.add(6)
//            arrNo.add(7)
//            for (i in arrNo) {
//                println("Number is: $i")
//            }
//
////            for (i in 0..10) {             //  (0 - 10)
////                println("Number is: ${num++}")
////            }
//
////            for (i in 0 until 10) {             //  (0 - 9)
//////                println("Number is: ${num++}")
//////            }
//
////            for (i in 10 downTo  0) {
////                println("Number is: ${num++}")
////            }
//
////            for (i in 10 downTo  0 step 3) {
////                println("Number is: ${num++}")
////            }
//
//        }
//
//    }


                                    ///      while  &&  do-while loop
//    companion object {
//        @JvmStatic
//        fun main (args: Array<String>) {
//            var num = 10
////            while (num<20) {
////                println(num)
////                num++
////            }
//
//            do {
//                println(num)
//                    num++
//            } while (num < 20)
//        }
//    }

                                                // Pair  & Triple
//    companion object {
//        @JvmStatic
//        fun main (args: Array<String>) {
////            var(a,b) = Pair("MSD", 7)          // pair
////            println("$a $b")
//
////          var name = Pair("Deepak", Pair(5,true))
////            println("${name.first}, ${name.second.second}")
////            println(name)
//
//            var number = Triple("Deepak", 7, 7.7)   // Triple
//            println(number)
//        }
//    }

}




//fun main() {
//    // Nullable Int
//    var number: Int?
//    number = 5
//    number = 10
//    val myClass = MyClass()
//    // Call function with named arguments
//    val sum = myClass.Add(a = 5, b = 6)
//    println("Sum is $sum")
//}
//class MyClass {
//    fun Add(a: Int, b: Int): Int {
//        return a + b
//    }
//}