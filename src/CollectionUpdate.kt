fun main(){
    println("<=====Immutable List=======>")
    val list = listOf<String>("Tom", "Jerry") //Immutable list
    for (name in list) println(name)
    println("<=======Mutable List========>")
    val list2 = mutableListOf<String>("Tom", "Jerry")  //Mutable List
    list2.add("Spike")
    list2.add("Mike")
    for (name in list2) println(name)

    println("<=======Immutable HashMap=========>")
    val listOfUsers = mapOf(1 to "Tom", 2 to "Jerry")
    for (user in listOfUsers) println(user.value)
    println("<========Mutable HashMap-=========>")
    val listOfUsers2 = mutableMapOf(1 to "Tom", 2 to "Jerry")
    listOfUsers2[3] = "Mike"
    listOfUsers2[4] = "Spike"
    for (user in listOfUsers2) println(user.value)
}