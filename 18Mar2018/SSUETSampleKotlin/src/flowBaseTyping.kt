
fun main(args: Array<String>) {

    var any : Any? = null

    var name : String? = null


    if (any is String)
        println(any.substring(0))

    println(name?.substring(0))

    if (name != null){
        println(name.substring(0))
    }

}