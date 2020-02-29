import java.lang.Exception

fun main(){
    print("Enter any number to divide:")
    val x = readLine()!!.toInt()
    try{
        val div = 100/x
        println(div)
    }catch (e:Exception){
        println(e.message)
    }
}