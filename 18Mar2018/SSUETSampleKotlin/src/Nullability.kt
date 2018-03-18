
fun nullable(arg : String?){
    var name : String? = null


    println(arg!!.substring(2).length)
    println(arg?.substring(2)?.length)

}

fun main(args: Array<String>) {
    nullable("ahgh")
}