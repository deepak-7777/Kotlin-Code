package com.example.kotlinsample

class Collection {
}

//fun main (){                                                       // List
//    val aList = mutableListOf ("Raman, Rajiv")
//    aList.add("Deepak")
//    println(aList)
//    aList.add(0,"Shyam")
//    println(aList)
//}


//fun main() {                                                           // Set
//    // Immutable Set
//    val aSet = setOf("12", 1, "Raj", "Rahul")
//    println(aSet)
//    // Mutable Setp
//    val mSet = mutableSetOf("Raj", "Rajeev", 1, false)
//    mSet.add(true)
//    println(mSet)
//}


//fun main() {                                                    ///    Map
//    // Immutable Map
//    val countryCodes = mapOf(
//        "IN" to "India",
//        "US" to "United States",
//        "UK" to "United Kingdom"
//    )
//    println("Immutable Map: $countryCodes")
//    println("Value of IN: ${countryCodes["IN"]}")
//    // Mutable Map
//    val studentMarks = mutableMapOf(
//        "Raj" to 85,
//        "Ravi" to 90,
//        "Rahul" to 78
//    )
//    println("Mutable Map: $studentMarks")
//    // Adding new entry
//    studentMarks["Ramesh"] = 95
//    println("Mutable Map: $studentMarks")
//    // Updating existing entry
//    studentMarks["Raj"] = 88
//    println("Mutable Map: $studentMarks")
//}


//fun main() {                                                   // ArrayList
//    // Creating an ArrayList of Strings
//    val names = ArrayList<String>()
//    // Adding elements
//    names.add("Raj")
//    names.add("Ravi")
//    names.add("Rahul")
//    println("ArrayList: $names")
//    // Accessing elements
//    println("First name: ${names[0]}")
//    // Updating element
//    names[1] = "Ramesh"
//    // Removing element
//    names.remove("Rahul")
//    println("Updated ArrayList: $names")
//    // Iterating through ArrayList
//    for (name in names) {
//        println("Name: $name")
//    }
//}


//fun main() {                                                             // Null
//    // This will give error because String cannot be null
//    // var name: String = null
//
//    //  Nullable type (can hold null)
//    var name: String? = null
//    println(name)  // Output: null
//    // Safe call (?.) → avoids NullPointerException
//    println(name?.length)  // Output: null
//    // Elvis operator (?:) → provide default value if null
//    val length = name?.length ?: 0
//    println("Length: $length")  // Output: Length: 0
//    // Assigning a non-null value later
//    name = "Priyanshu"
//    println(name)          // Output: Priyanshu
//    println(name.length)   // Output: 9
//}

