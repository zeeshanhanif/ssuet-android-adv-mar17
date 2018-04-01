

fun main(args: Array<String>) {

    var  name :String? = null

    if (true || 1==1 && 5>6)
        println("i am true")
    else if (false)
        println("i am false")

    var age : Any? = null
    age = "arbaz"

    if (age is String){
        println("is string")
    }else if (age is Int){
        println("is integer")

    }else{
        println("is any")
    }

    when(age){
        is String ->{
            println("age is in string")
        }
        34 -> {
            println("i am first block")
            println("age is $age")
        }
        45 -> println("age is $age")
        else -> println("age is null")

    }

    var number : Int =33
    var anyVar = number as? String

    println(anyVar)

    var arp = if (true) "name" else "age"

println(add(6,7))
println(concat(num2 =  6,num1 = 7))

}

fun add(num1 :Int,num2 : Int) = num1+num2
fun concat(num1 :Int,num2 : Int) = if (true) num1+num2 else num2-num1
