fun main(){
    print("Enter name:")
    val str: String = readLine().toString()
    print("Enter age:")
    val age: Byte = readLine()!!.toByte()
    print("Enter GPA:")
    val GPA: Float = readLine()!!.toFloat()

    println("<==========User Info==========>")
    println("Name: $str")
    println("Age: $age")
    println("GPA: $GPA")

}