package com.car.maintain

data class Person(val name:String, val age:Byte, val gender:String)

fun main() {
    val person = Person("Riz", 22, "Male")

    println("Person's name is: ${person.name}")
    println("Person's name is: ${person.age}")
    println("Person's name is: ${person.gender}")
}