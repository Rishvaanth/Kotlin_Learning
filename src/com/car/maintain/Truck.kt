package com.car.maintain

class Truck: CarOptions{
    var subType:String?= null
    constructor(type:String, model: Int, price: Double, milesDriven: Double, owner: String, subType:String):super(type, model, price, milesDriven, owner){
        this.subType = subType
    }

    constructor(type: String, model: Int, price: Double, milesDriven: Double, subType: String):super(type, model, price, milesDriven){
        this.subType = subType
    }

}
fun main(){
    val truck1 = Truck("Ferrari", 2015, 10000.0, 2219.3, "Spike", "Dumper" )
    val truck2 = Truck("Porsche", 2018, 20000.0,1232.1, "Mike", "Ice cream")
    val truck3 = Truck("Audi", 2005, 20500.123, 123.1, "Freight")
    println(truck1.milesDriven)
    println(truck2.owner)
    println("Effective Price of the car is ${truck3.getCarPrice()}")
    println(truck3.owner)
    println(truck1.type)
    println(truck1.price)
    println(truck2.subType)
    println(truck1.subType)
}