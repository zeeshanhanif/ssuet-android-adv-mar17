    var lamb1 = { x: Int, y: Int -> true }

    var lamb2: (Int, Int) -> Int = { x, y -> x*y}

    var lambIt: (String) -> String = {  "valus is ${it.length}"}//it

    /*fun count(value:(Int)->String){

        println(value(23))

    }*/

    fun button(title:String,onClick:(String) -> Unit){
        onClick(title)
        //hellow (aa)
    }

    fun sunAdapter(data:IntArray) : (Int) -> Unit{
        return fun (myVal:Int) : Unit{
            for (elem in data){
            println(" Sum Is ${elem+myVal} by adding ${myVal} to ${elem}")
            }
        }
    }

    /*fun hellow(xyz:(String) -> Unit){
        xyz("hello")
    }*/

fun main(args: Array<String>) {
    println(lamb1(2, 3))
    println(lamb2(2, 3))
    println(lambIt("hello world"))

    val aa = "Hello world"
    val bb = aa

    button("Save",{
        println("$it")
    })

    val returnVal = sunAdapter(intArrayOf(1,2,3,4,5,6,7))
    returnVal(3)

    sunAdapter(intArrayOf(1,2,3,4,5,6,7))(10)

}