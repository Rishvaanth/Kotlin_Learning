package com.car.maintain

fun ArrayList<Int>.findMax(): Int {
    var maxNumber = 0
    for(item in this){
        if (item>maxNumber) maxNumber = item
    }
    return maxNumber
}


fun main(){
    val listOfElements = arrayListOf<Int>()
    listOfElements.add(1)
    listOfElements.add(16)
    listOfElements.add(12)
    listOfElements.add(14)
    listOfElements.add(21)
    listOfElements.add(15)
    listOfElements.add(51)
    listOfElements.add(71)

    println(listOfElements.findMax())
}