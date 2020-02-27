fun main(){
    val x = addNumbers(1,2)
    println(x)

    val listOfNumbers = listOf(1,2,34,56,7,6,3,23,4)

    listOfNumbers.forEach { number -> println(number) }
}

val addNumbers = {x:Int, y:Int-> x+y}
