

fun sayHello3(greeting:String, itemsToGreet:List<String>){
    itemsToGreet.forEach{
            itemsToGreet -> println("$greeting to $itemsToGreet")
    }
}
// take variable number of string elements in parametre

fun sayHello4(greeting:String,vararg itemsToGreet: String){
    itemsToGreet.forEach{
            itemsToGreet -> println("$greeting to $itemsToGreet")
    }
}
fun greetperson(greeting: String, name: String){
    println(greeting+" "+name);
}
fun greetperson2(greeting: String = "Hello", name: String){
    println(greeting+" "+name);
}
fun greetperson3(greeting: String = "Hello", name: String ="Maksud"){
    println(greeting+" "+name);
}



fun main() {
    val interestingThing = listOf("Kotlin","Cpp");
    sayHello3("Hi",interestingThing )
    sayHello3("Hi", listOf() )

    // vararg use korle empty list na dileo empty bujhe ney
    sayHello4("Hi")
    // vararg use korle any number of element pass kora jay direct
    sayHello4("Hi", "Kotlin","Programming","Comics")

    sayHello4(greeting = "OMG", itemsToGreet = arrayOf("SRK","King Khan"),)

    println("------------------------")
    val interestingThing2 = arrayOf("Kotlin","Cpp")

    sayHello4("Hi", *interestingThing2)


    greetperson("Welcome","mushi")

    greetperson(greeting = "Hiiii", name = "Mahisa")

    greetperson2(name = "Ayesa")

    greetperson3()

}