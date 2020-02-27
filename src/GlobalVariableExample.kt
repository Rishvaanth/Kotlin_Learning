var name:String?= null

fun main(){
    name = "Henry"
    println(name)
    showUserInfo()
    println(" $name")
}

fun showUserInfo(){
    name = "Welcome $name"
    println(name)
}