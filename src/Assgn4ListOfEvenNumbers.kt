/*<============Assignment 4 List of Even Numbers===============>*/
fun main(){
    println("<=========Program Start================>")
    //Standard Method
    println("<==========Standard Method=============>")
    for (i in 1..100){
        if (i%2 ==0) print("$i ")
    }
    println("")
    //Alternate Method
    println("<==========Alternate Method============>")
    for (i in 2..100 step 2 ) print("$i ")
    println("")
    println("<==========Program Stop================>")
}