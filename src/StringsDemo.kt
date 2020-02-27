fun main(){
    val message = "Welcome to Kotlin"
    print("Please Enter your name!:")
    val name = readLine()!!.toString()
    var finalMessage = "      $message $name!           "
    println(finalMessage.toUpperCase())
    println(finalMessage.toLowerCase())
    println(finalMessage.trim())
    val tokens = finalMessage.trim().split(" ")
    for (token in tokens) println("Token: $token")

}
