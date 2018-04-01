
fun getName() : String?{
 var  name = "xyz"
    return name
}

fun setName(name : String){
    println(name)
}

fun setData(age : Int = 16,name : String? ){

    println("name = $name age = $age")
}

fun setAge(age : Int = 16){
    println(age)
}

fun setAnyThing(any:Any){
    println(any)
}

fun main(args: Array<String>) {

    //println(getName())

    setName("arbaz")
    setAge(55)
    setData(name = null,age = 44)

    setAnyThing(1221)
    setAnyThing("2323")
    setAnyThing(323L)

}
