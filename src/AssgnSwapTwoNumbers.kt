/*          Assignment: Given two variables, x and y, swap two variables using a third variable.        */

fun main(){
    var x:Byte? = 1
    var y:Byte? = 2
    var swapVar:Byte? = null
    println("Values of X and Y are: $x, $y")
    swapVar = x
    x = y
    y = swapVar
    println("Values of X and Y after swapping are: $x, $y")
}