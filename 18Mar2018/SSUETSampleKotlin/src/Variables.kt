
var  a = ""

fun variable(){
    var name = "ishaq"
    var age : Int = 22

    var name2 : String = """hello
        world
         "arr"
    """.trimMargin()

    // var or val variable name  : type?  = value
    var value  = 12.3
    var value2 = 233L
    var character: Char = 'a'
    var anyType : Any = "34"

    var table = "emp"
    var empName = "name"
    var values = "rameez"

    var query = "select * from $table where $empName = '$values'"

    println("Name = "+name+" age = "+ age)

    println("Name = $name, age = $age")

    println(query)
}

fun main(args: Array<String>) {
    variable()
}