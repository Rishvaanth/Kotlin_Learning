fun main(){
    println("<===========Pets Program============>")
    val listOfPets = ArrayList<String>()
    var u = 1
    do {
        print("Enter name of Pet $u or exit to quit:")
        val petName = readLine().toString()
        if (petName != "exit")listOfPets.add(petName)
        u++
    }while (petName != "exit")

    println("Your Pets are in the Array List")
    for (i in 0 until (listOfPets.size)) {
        u = i+1
        println("Pet $u is:" +listOfPets[i])
    }
    println("Your Pets are using Objects:")
    for (pet in listOfPets) println("Pet:$pet")

    if (listOfPets.contains("cat")) println("Your cat is qualified for the program!")
}