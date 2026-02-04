package com.example.kotlinsample

//class First {
//    var someInt = 10
//    fun add(a:Int , b:Int ) : Int {
//        return a+b
//    }
//}
//fun main () {
//    val kb = First()
//    println("The Integer is: " + kb.someInt)
//    println("The Sum is: " + kb.add(3,4))
//}


//class First constructor (val a: Int) {                     // primary constructor
//        var someInt = 10
//        init {
//            println("A = " + a);
//        }
//        fun add(a:Int , b:Int ) : Int {
//            return a+b
//        }
//}
//fun main () {
//    val kb = First(4)
//    println("Sum = " + kb.add(4,6));
//}



//class First {                                       // Custom constructor
//    constructor (a: Int, b: Int) {
//        val sum = a+b;
//        println("A+B = "+ sum);
//    }
//    constructor (a: Int, b: Int, c: Int) {
//        val sum = a+b+c;
//        println("A+B+C = "+ sum);
//    }
//}
//fun main () {
//    val kb = First(4,5,9)    // yaha value pass hota hai
//}


//class First {
//    constructor (a: Int, b: Int) {
//        val sum = a+b;
//        println("A+B = "+ sum);
//    }
//    constructor (a: Int = 100, b: Int = 20, c: Int =30) {        //   default value diya gaya hai
//        val sum = a+b+c;
//        println("A+B+C = "+ sum);
//    }
//}
//fun main () {
//    val kb = First()
//}



//class Sum {                                                   // Companion Object
//    var anotherInt: Int = 20
//    companion object {
//        var someInt: Int = 10
//        fun callMe() = println("This method is called!")
//    }
//}
//fun main() {
//    // Accessing companion object members directly using class name
//    println(Sum.someInt)
//    Sum.callMe()
//    println(Sum().anotherInt)
//}


//class CompanionClass {
//    var firstNo: Int = 10
//    fun Add(a: Int, b: Int): Any {
//        return a + b
//    }
//    companion object {
//        var secondNo: Int = 20
//        fun Product(a: Int, b: Int): Int {
//            return a * b
//        }
//    }
//}
//fun main() {
//    // Accessing instance variable and method
//    val obj = CompanionClass()
//    println("First No: ${obj.firstNo}")
//    println("Sum: ${obj.Add(70,7)}")
//    println("Second No: ${CompanionClass.secondNo}")
//    println("Product: ${CompanionClass.Product(5, 7)}")
//}



//open class ClassA {
//    var name = "Deepak"
//    fun Add(a: Int, b: Int): Int {
//        return a + b
//    }
//}
//class ClassB : ClassA() {
//    fun showMessage(): String {
//        return "Hello from ClassB"
//    }
//}
//fun main() {
//    val classB = ClassB()
//    println(classB.name)
//    println(classB.Add(3, 4))
//    println(classB.showMessage())
//}


//fun main() {                                    //  Use 'this' keyword
//    val audi = Audi()
//    audi.interior(chasisNo = 1234)
//}
//open class Car {
//    // Basic Entities of Car
//}
//class Audi : Car() {
//    var chasisNo = 10000
//    fun interior(chasisNo: Int) {
//        println("Interior setup with chasis number: ${this.chasisNo}")         // use 'this'
//    }
//}


//fun main() {                                          /// use 'super' keyword
//    val audi = Audi()
//    audi.details()
//}
//open class Car {
//    open var brand: String = "Generic Car"
//    open fun engine() {
//        println("Car engine started")
//    }
//}
//class Audi : Car() {
//    override var brand: String = "Audi"
//    override fun engine() {
//        println("Audi engine started")
//    }
//    fun details() {
//        println("Brand from child: $brand")       // Child class property
//        println("Brand from parent: ${super.brand}") // Parent class property
//        engine()        // Calls Audi’s overridden method
//        super.engine()  // Calls Car’s original method
//    }
//}


//fun main() {                                            ///  Interface
//    val audi = Audi()
//    audi.start()
//    audi.stop()
//}
//interface Vehicle {
//    fun start()   // abstract method
//    fun stop()    // abstract method
//    fun info() {  // default method
//        println("This is a vehicle.")
//    }
//}
//class Audi : Vehicle {
//    override fun start() {
//        println("Audi is starting...")
//    }
//    override fun stop() {
//        println("Audi is stopping...")
//    }
//}


//fun main() {                        /// Abstract Class
//
//}
//abstract class AbClass {
//    var name: String = "John"
//    abstract var branch: String
//    fun Add(a: Int, b: Int): Int {
//        return a + b
//    }
//    abstract fun operate(a: Int, b: Int): Int
//}


abstract class Animal {                  // Abstract class
    abstract fun makeSound()

    fun eat() {
        println("This animal eats food.")
    }
}
// Subclass inheriting from Animal
class Dog : Animal() {
    override fun makeSound() {
        println("Bark!")
    }
}
// Another subclass
class Cat : Animal() {
    override fun makeSound() {
        println("Meow!")
    }
}
fun main() {
    val dog = Dog()
    dog.makeSound()  // Output: Bark!
    dog.eat()        // Output: This animal eats food.
    val cat = Cat()
    cat.makeSound()  // Output: Meow!
    cat.eat()        // Output: This animal eats food.
}
