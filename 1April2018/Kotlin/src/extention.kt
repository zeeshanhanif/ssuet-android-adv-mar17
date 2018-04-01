fun main(args: Array<String>) {
    var name = "arbaz"

    println(name.charAt())
    println(name)
    var num = 23


    var arr = intArrayOf(1, 34, 5, 4, 4, 2, 3, 4)
    arr.swap()

    for (a in arr)
        println("$a \t")

    var nul:String? = null

    num.printVal()

    println()
    nul.printVal()
    println()

    var abc : Int = 2

    println(34 minusLeft 22)

}


fun Any?.printVal() {
    if (this == null)
        print("this value is null")
    else
        print("value of var is $this")
}

fun IntArray.swap() {
    var temp = this[0]
    this[0] = this[this.size - 1]
    this[this.size - 1] = temp

}

fun String.charAt(): Char {
    return this[0]
}

infix fun Int.minusLeft (a:Int) :Int{
    return  this - a

}

