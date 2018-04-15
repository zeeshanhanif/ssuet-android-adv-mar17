fun main(args: Array<String>) {
    val age = 20
    if(age in 10..15){
        println("Is In 10 to 15")
    }else if(age in 20..25){
        println("Is In 20 to 25")
    }else{
        println("None")
    }

    when(age){
        in 10..15,in 15..20 -> {

        }
        else -> {

        }
    }

    when{
        (age in 10..15 || age in 15..20) -> println("Is In 10 to 15")
        age in 20..25 -> {
            println("Is In 20 to 25")
        }
        else -> println("None")
    }
}