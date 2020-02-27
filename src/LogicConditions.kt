fun main(){
    print("Please enter your Grade:")
    val grade = readLine()!!.toInt()

    if (grade in 90..100){
        println("S")
    }
    else if (grade in 80..89){
        println("A")
    }
    else if (grade in 70..79){
        println("B")
    }
    else if (grade in 60..69){
        println("C")
    }
    else if (grade in 50..59){
        println("D")
    }
    else if (grade in 40..49){
        println("E")
    }
    else print("Sorry, Failed")
}
