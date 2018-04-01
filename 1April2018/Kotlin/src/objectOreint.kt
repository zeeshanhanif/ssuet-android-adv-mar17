
class Student(name:String) : Human(10) {

    init {
        print(name)
    }

    fun abc(){
//        printVal()
        print("hello class")

        eat()
    }

}

open class Human{

    constructor(time:Int){

    }
     fun eat(){
         println()
        println("eating")
    }

}

class Teacher_OLD{
    lateinit var name : String
    var age : Int = 0
    constructor(name:String){
        this.name = name
        println(name)
    }
    constructor(name:String,age:Int){
        this.name = name
        this.age = age

        println("$name $age")
    }
    init {
        println(age)
    }

}

class Car(val modelName:String,val company:String,val year:Int){
    fun drive(){
        print("$modelName is Driving")
    }
}


fun main(args: Array<String>) {
    val obj = Student("arbaz")
    obj.abc()

    Student("arbaz").abc()
    println()

    val objTeacher = Teacher_OLD("ishaq",20)
}