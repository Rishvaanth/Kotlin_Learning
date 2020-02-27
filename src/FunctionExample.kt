fun main(){
    println("Start of Main")
    var x = add(1,12)
    println("The Sum is $x")
    x = add(1)
    println("The Sum is $x")
    x = add(323,213)
    println("The Sum is $x")
    x = add(723,213)
    println("The Sum is $x")


    displayInfo("Tom", "Jerry", "Mike", "Spike")

    println("End of Main")
}

fun add(x:Int = 0,y:Int = 0):Int {
    return x+y
}

fun displayInfo (vararg names:String){
    for (name in names) println(name)
}