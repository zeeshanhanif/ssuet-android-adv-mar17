fun main(args: Array<String>) {
    outer(34)
}


fun outer(age: Int) {
//    var age = a
     fun outer(): Boolean {
        if (age < 30)
            return true
        else
            return false
    }
    println(outer(age))
}