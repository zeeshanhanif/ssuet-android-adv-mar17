data class User(val id:Int,val name:String,val age:Int){
    var rollNo:String
        get() = "Hello"
        set(value) {
            if(value == "123"){
                rollNo = value
            }
        }
}

fun main(args: Array<String>) {
    val user1 = User(10,"Hello",20)
    val user2 = User(11,"Hello",20)
    val user3 = user1.copy()
    user3.rollNo = "456"
    println(user1.equals(user3))
    //val id = user1.id
    //val name = user1.name



    val (id1,name1,hello) = user1




}