package com.car.maintain

interface CreditCard{
    val cardNumber:String
    fun score(age:Int)
}

class MasterCard(override val cardNumber: String) :CreditCard{
    override fun score(age: Int){
        if (age>50) println("MasterCard says Negative")
        else println("MasterCard says Positive")
    }

}

class Visa(override val cardNumber: String) :CreditCard{
    override fun score(age: Int){
        if (age>60) println("Visa Card says Negative")
        else println("Visa Card says Positive")
    }

}

fun main(){
    val visa=Visa("26872682378")
    visa.score(64)
    val masterCard = MasterCard("3879837289")
    masterCard.score(66)
}

