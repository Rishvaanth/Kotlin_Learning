class UserAdmin<T,C>(Credit:T, Id:C){                   //Class Parameters Template
    init {
        println(Credit)
        println(Id)
    }
}

fun <T> display(process:T){                             //Function Template
    println(process)
}


fun main(){
    val userAdmin1 = UserAdmin("Hello",281937)
    val userAdmin2 = UserAdmin(23982,"Hello")
    display("Hello World")
}