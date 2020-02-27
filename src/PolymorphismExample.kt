fun main(){
    println("Program Start!")
    showInfo("Tom")
    showInfo(3262378648)
    println("Program End!")
}

fun showInfo(x: Long){
    println("Found Number, $x")
}

fun showInfo(x:String){
    println("Found String, $x")
}
