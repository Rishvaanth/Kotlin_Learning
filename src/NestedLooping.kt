fun main(){
    val defaultString= "No Users Registered"
    print("Enter number of Users:")
    val numberOfUsers = readLine()!!.toInt()
    if (numberOfUsers == 0) {
        println(defaultString)
        return
    } else {
        for (u in 1..numberOfUsers) {
            print("Enter user $u's name:")
            val name = readLine()!!.toString()
            print("Enter Town/City where $name lives:")
            val city = readLine()!!.toString()
            var pets: String? =""
            print("Enter how many pets User $name has:")
            val numberOfPets = readLine()!!.toInt()
            for (i in 1..numberOfPets) {
                println("Enter pet $i name:")
                pets = pets + readLine().toString()+","
            }
            println("<=========User Info==========>")
            println("User name is: $name")
            println("User Lives in: $city")
            println("User Has: $pets")
            if (pets!!.contains("cat")) println("We have a program for cat for $name!")
            println("<=========End of User Info==========>")
        }
    }
    println("<=========End of Program===========>")
}