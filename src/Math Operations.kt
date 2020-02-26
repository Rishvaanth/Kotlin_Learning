fun main(){
    println("<======This is a Simple Calculator=======>")
    print("Enter first number:")
    val x = readLine()!!.toDouble()
    print("Enter second number:")
    val y = readLine()!!.toDouble()

    val sum  = x+y
    println("The Sum is: $sum ")

    val sub = x-y
    println("The Subtraction is: $sub ")

    val mul = x*y
    println("The Multiplication is: $mul ")

    val div = x/y
    println("The Division is: $div")
}