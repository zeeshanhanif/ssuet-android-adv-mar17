fun main(args: Array<String>) {

    var isContinue  = true
    while (isContinue){
    println("in while block")
        isContinue  = false
    }

    do {
        println("in do while block")
    }while (isContinue)

    // for(int i = 0;i<10;i++)



    for (i in 10 downTo 0 step 2){
        print("$i \t")
    }
    println()

    for (i in 0..10 ){
        print("$i \t")
    }
    println()

    for (i in 0..10 step 2){
        print("$i \t")
    }
    println()


    var str = "mynameisarbaz"

    for (c in str){
        print("$c \t")
    }

    println()
    var arr = arrayOf("name","age","contact")

    for (value in arr){
        print("$value\t")
    }
    println()
    for (i in 0 until  10){
        print("$i \t")
    }
    println()


    var num1 = 2
    var num2 = 3

    println("sum of $num1 and $num2 is ${num1+num2}")


    var any  : Any= 23;

    var arb = any as? Int
    println(arb)
    arb.printVal()
}