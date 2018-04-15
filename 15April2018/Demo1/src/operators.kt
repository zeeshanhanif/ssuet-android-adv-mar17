infix fun String.addIt(secondVal:String):String{
    return this+secondVal
}

fun main(args: Array<String>) {
    println("Hello" addIt "World")

    val myStr = "Hello".addIt("World")

}