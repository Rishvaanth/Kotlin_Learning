import java.io.FileWriter
import java.lang.Exception

fun main(){
    print("Write to File Text here:")
    val x = readLine().toString()
    writeToFile(x)
}

fun writeToFile(str:String){
    try{
        val file = FileWriter("text.txt",true)
        file.write("\n"+str)
        file.close()
        println("File has been created")
    }catch (e:Exception){
        println(e.message)
        println("File has not been created")
    }
}