interface MyInterface{
    fun MyMtehod();
}

class MyHelloClass : MyInterface{
    override fun MyMtehod() {

    }
}

fun passInterface(myInterface: MyInterface){
    myInterface.MyMtehod()
}

fun passJavaInterface(javaInterface: MyJavaInterface){
    javaInterface.myMethod()
}

fun main(args: Array<String>) {
    passInterface(object : MyInterface{
        override fun MyMtehod() {
            println("hello World")
        }
    })
}