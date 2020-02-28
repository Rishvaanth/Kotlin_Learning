package com.car.maintain

class Car(var type:String, val model:Int, private val price:Double, val milesDriven:Double, val owner:String){
    init {
        println("Object Class Created!")
    }
    fun getCarPrice():Double{
        return this.price-(this.milesDriven.toDouble()*10)
    }
    fun setCarType(type:String){
        this.type = type
    }
}

fun main(){
    val car1 = Car("Ferrari", 2015, 10000.0, 2219.3, "Spike")
    val car2 = Car("Porsche", 2018, 20000.0,1232.1, "Mike")
    val car3 = Car("Audi", 2005, 20500.123, 123.12, "Jerry")
    val listOfCars = arrayListOf<Car>()
    listOfCars.add(Car("Ferrari", 2015, 10000.0, 2219.3, "Spike"))
    listOfCars.add(Car("Porsche", 2018, 20000.0,1232.1, "Mike"))
    listOfCars.add(Car("Audi", 2005, 20500.123, 123.12, "Jerry"))
    println(car1.milesDriven)
    println(car2.owner)
    println("Effective Price of the car is ${car3.getCarPrice()}")
    println(car3)
    println(car1.type)
    car1.setCarType("Bentley")
    println(car1.type)

    for (car in listOfCars){
        println("<=========>")
        println(car.owner)
        println(car.model)
        println(car.type)
        println("<=========>")
    }
}