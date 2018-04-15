fun main(args: Array<String>) {
    val friends = arrayOf(
            "F1","F2","F3"
    )

    val newFriends = friends.filter {
        it in arrayOf("F1","F2")
    }


    newFriends.forEach {myItem->println(myItem)}

    var squares = listOf<Double>(10.0,20.0,30.0,40.0)
    squares = squares.filter {
        it >= 80
    }.map {
        Math.sqrt(it.toDouble())
    }

    squares.forEach {
        println(it)
    }

    val myScores = arrayOf(
            20,30,40
    )

    myScores.map {
        it+10
    }.filter {
        it > 30
    }.forEach{
        println(it)
    }
}














