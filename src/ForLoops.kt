fun main(){
    println("<============Incrementing===============>")
    for (i in 1..100 step 5){
        println("Number is $i!")
    }
    println("<===========Decrementing================>")
    for (i in 100 downTo 1 step 10){
        println("Number is $i")
    }
    println("<==========End of Operations=============>")
}