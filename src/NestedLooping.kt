fun main(){
    print("Enter your name:")
    val name = readLine()!!.toString()
    print("Enter your Town/City where you live:")
    val city = readLine()!!.toString()
    var pets: String? = null
    for (i in 1..3){
        println("Enter pet $i name:")
        pets = pets+ "," + readLine().toString()
    }
    println("<=========User Info==========>")
    println("User name is: $name")
    println("User Lives in: $city")
    println("User Has: $pets")

}