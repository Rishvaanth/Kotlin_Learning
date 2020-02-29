import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(){
    print("1 to Read, 2 to Write:")
    when (readLine()!!.toInt()){
        1->readFromFile()
        2->{
            print("Write to File Text here:")
            val x = readLine().toString()
            writeToFile(x)
        }
    }

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


fun readFromFile(){
    try {
        val file = FileReader("text.txt")
        var c:Int
        do {
            c = file.read()
            print(c.toChar())
        }while (c!=-1)
    }catch (e:Exception){
        println(e.message)
        println("File Read Failed")
    }
}