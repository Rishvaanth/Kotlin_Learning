abstract class CreditCard(){
    fun creditID():String{
        return "82et8dgyugwdq"
    }
    abstract fun generateId()
}
class UserInfo():CreditCard(){
    fun getUserInfo():String{
        return creditID()
    }

    override fun generateId() {
        println("Generated")
    }
}
fun main(){
    val credit = UserInfo()
    println(credit.getUserInfo())
    credit.generateId()
}