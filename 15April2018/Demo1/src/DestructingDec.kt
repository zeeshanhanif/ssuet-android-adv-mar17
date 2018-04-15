class Person(val name:String,val age:Int){
    operator fun component1():String{
        return "Hello"
    }
    operator fun component2():String{
        return "Hello"
    }
    operator fun component3():Int{
        return 10
    }
    operator fun component4():Float{
        return 10.3f
    }
}

fun main(args: Array<String>) {
    val (name,age,mydata) = Person("hello",10)
}