
package com.example.kotlinsyntaxapp.functions

// Example for functions
fun example() {
    println("This is an example of functions")
}
//Basic Function
fun greet(name: String) {
return "Hello, $name!"
}
fun main() {
val message = greet("Kotlin")
println(message)
}
