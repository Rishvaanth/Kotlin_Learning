fun main(){
    val x = Singleton.instance
    x.name = "Riz"
    println(x)
    println(x.name)
    val y = Singleton.instance
    y.name = "uiwqdguiqw"
    println(y.name)
    val z = Singleton.instance
    println(z.name)
    println(x.name)
}

class Singleton private constructor() {
    var name: String? = null

    init {
        println("Singleton Class is created!!")
    }
    companion object {
        val instance:Singleton by lazy { Singleton() }
    }
}