/*<===============Assignment 3 Odd or Even Calculator================>*/

fun main(){
    print("Enter any number:")
    val num = readLine()!!.toInt()
    if (num%2 ==0) println("the number is even")
    else println("the number is odd")
}