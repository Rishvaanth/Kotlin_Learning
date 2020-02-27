fun main(){
    println("<===============Program Start=========>")
    println("<===========Continue Example=========>")
    for (i in 1..100){
        if (i%5 == 0) continue
    println("Count is $i")
    }

    println("<================Break Example=============>")
    for (i in 1..100){
        if (i == 32) break
    println("Count is $i")
    }

    println("<=================Inner Loop Example==========>")
    loop@ for (i in 1..10){
        println("Number:$i")
        for (innerloop in 1..100){
            if (innerloop == 23) break@loop
        println("Innerloop:$innerloop")
        }
    }
    println("<=================End of Program=============>")
}