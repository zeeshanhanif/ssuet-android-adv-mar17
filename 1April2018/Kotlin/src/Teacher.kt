open class HumanNew(val name:String){
    open fun eat(){
        println("Human named $name is eating")
    }
}

class Teacher(name: String) : HumanNew(name){
    override fun eat(){
        println("Teacher named $name is eating")
    }
}

fun main(args: Array<String>) {
    val t1 = Teacher("Arbaz")
    t1.eat()
}