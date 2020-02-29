enum class  Direction{
    NORTH, EAST, WEST, SOUTH
}



fun main (){
    val direction = Direction.NORTH

    if (direction == Direction.NORTH) println("User went North")
    else println("No idea where user is!")
}