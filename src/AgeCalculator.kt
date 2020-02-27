import java.util.*

fun main(){
    print("Enter your Birth year:")
    val yearOfBirth = readLine()!!.toInt()
    print("Enter your Birth month:")
    val monthOfBirth = readLine()!!.toInt()
    println("Enter your Birth date:")
    val dayOfBirth = readLine()!!.toInt()
    val currentYear =  Calendar.getInstance().get(Calendar.YEAR)


    val age = currentYear-yearOfBirth

    println("Your age is $age")

}