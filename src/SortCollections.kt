class Person(var name:String, var age:Int):Comparable<Person>{
    override fun compareTo(other: Person): Int {
        return this.age-other.age
    }
}

fun main(){
    var listOfUsers = arrayListOf<Person>()
    listOfUsers.add(Person("Mike",37))
    listOfUsers.add(Person("Kyle",21))
    listOfUsers.add(Person("Fred",21))
    println("Before Sorting")
    println(listOfUsers)
    for (person in listOfUsers) {
        println(person.name)
        println(person.age)
    }
    listOfUsers.sort()
    println("After Sorting")
    println(listOfUsers)
    for (person in listOfUsers) {
        println(person.name)
        println(person.age)
    }
}