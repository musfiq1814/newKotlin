

fun sayHello2(greeting:String, itemsToGreet:List<String>){
    itemsToGreet.forEach{
        itemsToGreet -> println("$greeting to $itemsToGreet")
    }
}


fun main() {
    val interestingThing = listOf("Kotlin","Cpp");
    sayHello2("Hi",interestingThing )
}