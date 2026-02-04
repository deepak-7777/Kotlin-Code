package com.example.kotlinsample

import androidx.annotation.CheckResult
import org.w3c.dom.Text

//enum class Days(val holiday: Boolean) {         /// enum clas
//    MONDAY(false),
//    TUESDAY(false),
//    WEDNESDAY(false),
//    THURSDAY(false),
//    FRIDAY(false),
//    SATURDAY(true),
//    SUNDAY(true);
//}
//fun main() {
//    println("Today is: " + Days.MONDAY)
//    for (day in Days.values()) {
//        if (day.holiday) {
//            println("$day is a Holiday!")
//        }
//    }
//}


//fun main() {                                          /// Generic class
//    val genClass = GenClass<Int>(11)
//}
//class GenClass<T>(value: T) {
//    init {
//        println("The value is: $value")
//    }
//}


//fun main() {                                          /// Generic class
//    val genClass = GenClass(true)
//}
//class GenClass<T>(value: T) {
//    init {
//        println("The value is: $value")
//        Check<T>(value);
//    }
//}
//fun<T> Check(text: T) {
//    println("Received value is: " + text);
//}


//fun main() {                                          /// Lambdas
//    println("The Square of 2 is: " + Square(2));
//    println("The Square of 7 is: " + sqr(7));
//    println("Add =  " + add(2,5));
//    printName();
//}
//val sqr : (Int) -> Int = {x -> x*x};      // Lambdas
//val add : (Int, Int) -> Int = {x, y -> x+y};      // Lambdas
//val printName = {println("Hello, Deepak")};    // Lambdas
//fun Square(a: Int) : Int {             // normal
//    return a * a;
//}


//fun main() {                                         /// High Order Function
//    highOrder(printMe)
//    highAdd(Add)
//}
//val printMe = { println("This Line has been printed") }
//val Add = { a: Int, b: Int -> a + b }
//fun highOrder(func: () -> Unit) {
//    func()
//}
//fun highAdd(addFunc: (Int, Int) -> Int) {
//    val result = addFunc(10, 20)
//    println("The sum is: $result")
//}



//fun main() {                                                       ////   Delegations
//    val creator = TaskCreator()
//    val executor = TaskExecutor()
//    val manager = TaskManager(creator, executor)
//    manager.Create()
//    manager.Execute()
//}
//interface Task {
//    fun Create()
//}
//interface ExecuteTask {
//    fun Execute()
//}
//// Implement Task interface
//class TaskCreator : Task {
//    override fun Create() {
//        println("Task Created")
//    }
//}
//// Implement ExecuteTask interface
//class TaskExecutor : ExecuteTask {
//    override fun Execute() {
//        println("Task Executed")
//    }
//}
//// TaskManager implements both Task & ExecuteTask
//class TaskManager(
//    val creator: Task,
//    val executor: ExecuteTask
//) : Task, ExecuteTask {
//    override fun Create() {
//        creator.Create()
//    }
//    override fun Execute() {
//        executor.Execute()
//    }
//}


//       //            Type of Function   :-    with, let, apply, run, also
//fun main() {                                                             ///   Scope Function
//    val user = User().apply {          // used 'apply'
//        name = "John"
//        age = 25
//        mobNo = "9876543210"
//    }
//    println("The name of user is: " + user.name)
//    println("The age of user is: " + user.age)
//    println("The Mob no. of user is: " + user.mobNo)
//}
//class User {
//    var name: String = ""
//    var age: Int = 0
//    var mobNo: String = ""
//}


//fun main() {
//    val user = User().apply {                                     /// used 'apply'
//        name = "John"
//        age = 25
//    }
//    val age = with(user) {                                        /// used   'with'
//        println("The name of user is: " + name)
//        age
//    }
//    println("The Age of user is: " + age)
//    user.also {                                                  /// used    'also'
//        it.name = "Harry"
//        println("The Name Has Changed!")
//    }
//    println("The Name is: " + user.name)
//}
//class User {
//    var name: String = ""
//    var age: Int = 0
//}


//fun main() {
//    val user = User().apply {
//        name = "John"
//        age = 25
//        mobNo = "9876543210"
//    }
//    val userInfo = user.run {                                    ///   run
//        println("Inside run block:")
//        println("Name: $name")
//        println("Age: $age")
//        println("Mobile: $mobNo")
//        // You can return a value from run
//        "User Info: Name = $name, Age = $age, Mobile = $mobNo"
//    }
//    println(userInfo)
//}
//class User {
//    var name: String = ""
//    var age: Int = 0
//    var mobNo: String = ""
//}


fun main() {
    var name: String? = "John"
    name?.let {                                                          ///   let
        println("Name is not null. It is: $it")
        println("Length of name is: ${it.length}")
    }
    val user = User().apply {
        name = "Alice"
        age = 28
        mobNo = "1234567890"
    }
    // Use 'let' to do something with the user object
    user.let {
        println("User's name is: ${it.name}")
        println("User's mobile number is: ${it.mobNo}")
    }
}
class User {
    var name: String = ""
    var age: Int = 0
    var mobNo: String = ""
}
