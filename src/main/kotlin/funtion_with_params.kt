import java.util.StringJoiner


fun sayHello2(itemToGreet: String){

    val msg = "hello $itemToGreet"
    println(msg)
    //println("hello "+itemToGreet)
}


fun action(num1: Int ,c:Char, num2: Int){
    if(c=='+')
        println(num1+num2)
    if(c=='-')
        println(num1-num2)
    if(c=='*')
        println(num1*num2)
    if(c=='/')
        println(num1/num2)
    if(c=='%')
        println(num1%num2)

}



fun main() {
    sayHello2("musfiq")
    sayHello2("kotlin")
    action(7,'/',5)
    action(7,'%',5)
}