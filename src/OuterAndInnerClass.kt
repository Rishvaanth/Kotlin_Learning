class Outer{
    val string:String? = "Hello"
    inner class Inner{
        fun show(){
            println("Hello")
        }
    }
}
fun main(){
    val x = Outer()
    x.Inner().show()
}