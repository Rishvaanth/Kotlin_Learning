package com.car.maintain

open class CarOptions()
    {
        var type:String?=null
        var model:Int?=null
        var price:Double?=null
        var milesDriven:Double?=null
        var owner:String?=null
        constructor( type:String, model:Int, price:Double, milesDriven:Double, owner:String) : this() {
            this.type = type
            this.model = model
            this.price = price
            this.milesDriven = milesDriven
            this.owner = owner
        }
        constructor( type:String, model:Int, price:Double, milesDriven:Double) : this() {
            this.type = type
            this.model = model
            this.price = price
            this.milesDriven = milesDriven
        }

    fun getCarPrice():Double{
        return this.price!!-(this.milesDriven!!.toDouble()*10)
    }
}

fun main(){
    val car1 = CarOptions("Ferrari", 2015, 10000.0, 2219.3, "Spike")
    val car2 = CarOptions("Porsche", 2018, 20000.0,1232.1, "Mike")
    val car3 = CarOptions("Audi", 2005, 20500.123, 123.12)
    println(car1.milesDriven)
    println(car2.owner)
    println("Effective Price of the car is ${car3.getCarPrice()}")
    println(car3.owner)
    println(car1.type)
}