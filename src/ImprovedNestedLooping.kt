import java.util.*
import kotlin.collections.HashMap

fun main() {
    val listOfUsers = HashMap<String, LinkedList<String>>()
    var v = 1
    while (true) {
        print("Enter user $v's name or quit to exit:")
        val name = readLine()!!.toString()
        if (name != "quit") {
            print("Enter Town/City where $name lives:")
            val city = readLine()!!.toString()
            val listOfUserPets = LinkedList<String>()
            var u = 1
            do {
                print("Enter name of pet #$u or next to go next:")
                val petName = readLine()!!.toString()
                if (petName != "next") listOfUserPets.add(petName)
                u++
            } while (petName != "next")
            listOfUsers["$name:$city"] = listOfUserPets
            v++
        } else break
    }
    for (key in listOfUsers.keys) {
         println("<=========User Info==========>")
         println("User Name and City: $key")
         println("User Has: ")
         for (petName in listOfUsers[key]!!) {
             println(petName)
             if (petName.contains("cat")) println("We have program for cat")
         }
    }
}
