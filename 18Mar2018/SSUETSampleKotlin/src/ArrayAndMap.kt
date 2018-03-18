
fun main(args: Array<String>) {

    var arr = intArrayOf(2,2)

    var list = arrayListOf<String>("hello","world")

    var name = "ishaq"

    var ages = mapOf("arbaz" to 33, 34 to "")

    var capital = mapOf<String,String>(
            "Pakistan" to "Islamabad",
            "China" to "Bejin"
    )

    list.add("kotlin")

    ages.plus("D" to 3)
    ages.minus("D")

    println(capital.get("Pakistan"))

    println(ages.get("arbaz"))

    println(name[0])
    println(arr[0])
    println(list.get(0))

}