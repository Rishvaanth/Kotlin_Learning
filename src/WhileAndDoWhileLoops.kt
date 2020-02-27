fun main(){
    println("<==========For Looping===========>")
    for (i in 1..100 step 5) println("Count is $i")

    println("<==========While Looping==========>")
    var i = 1
    while (i<100){
        println("Count is $i")
        i+=2
    }
    println("<=========Do While Looping=========>")
    do {
            println("Count is $i")
            i-=2
    }while (i>0)
}