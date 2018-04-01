

fun sum_up(vararg par:Int) : Int {//return Type
//    var temp = 0
//
//    for (value in par)
//        temp+=value

    return par.sum()

}

fun sum(): Int {
    return 0
}
fun main(args: Array<String>) {


    var arr = intArrayOf(2,3,4,5)

    println(sum_up(3,4,*arr,5,6,7))
}