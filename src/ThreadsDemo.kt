import java.lang.Exception

fun main(){
    val x = Threads("Thread 1")
    x.start()
    val y = Threads("Thread 2")
    y.start()
    val z = Threads("Thread 3")
    z.start()
    z.join()
    println("Count down over")
}

class Threads(ThreadName: String) : Thread() {
    var threadName:String?= ThreadName

    init {
        println("${this.threadName} has started")
    }
    override fun run() {
        var count = 0
        var flag = false
        while (count<11){
            println(this.threadName+": "+count)
            count++
            try {
                Thread.sleep(1000)
            }catch (e:Exception){
                println(e.message)
            }
        }
    }
}