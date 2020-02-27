fun main(){
    print("Please Enter the foodID you have:")
    when (readLine()!!.toInt()){
        1 -> {
            println("You get a sandwich")
            println("You get salad")
        }
        2 -> {
            println("You get Fried Chicken")
            println("You get Krushers")
        }
        else ->{
            println("You ordered nothing")
        }

    }
}