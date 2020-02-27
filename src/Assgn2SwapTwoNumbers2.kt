/*<=============Assignment 2 Given two variables, x and y, swap two variables without using a third variable.=======>*/
fun main(){
    var x = 10
    var y = 20
    println("Numbers before swapping are $x , $y")
    x += y
    y = x - y
    x -= y
    println("Numbers after swapping are $x , $y")
}