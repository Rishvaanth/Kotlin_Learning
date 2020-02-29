package com.car.maintain

interface CreditCard{
    val cardNumber:String
    fun score(age:Int)
}

class MasterCard(override val cardNumber: String):CreditCard{
    override fun score(age: Int){
        if (age>50) println("MasterCard says Negative")
        else println("MasterCard says Positive")
    }
}

class PayPal(client:CreditCard):CreditCard by client{
    fun printInfo(){
        println(this.cardNumber)
    }
    fun print(){
        println("This works")
    }
}



class Visa(override val cardNumber: String):CreditCard{
    override fun score(age: Int){
        if (age>60) println("Visa Card says Negative")
        else println("Visa Card says Positive")
    }

}

fun main(){
    val visa=Visa("26872682378")
    visa.score(64)
    val payPal1 = PayPal(visa)
    payPal1.printInfo()
    println("PayPal card number:${payPal1.cardNumber}")
    val masterCard = MasterCard("3879837289")
    masterCard.score(66)
    val payPal2 = PayPal(masterCard)
    payPal2.printInfo()
    payPal2.print()
    println("PayPal card number:${payPal2.cardNumber}")
}

