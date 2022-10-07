



// notes :
// val is constant
// var is variable

val GlobalName: String = "WWW"
var GlobalName2: String = "World Wide Web"


// var and val is nullable

var GlobalName3: String? = null

val GlobalName4: String? = null

fun main(args: Array<String>) {
    println("Hello World!")

    var a = 5

    val name: String = "Musfiq"  // constant

    // name = ""   not possible


    var name2: String = "Rahman"

    name2 = "Rahman Saikat"

    println(name)


    println(GlobalName)


    println(GlobalName2)

    GlobalName2 = "Renamed WWW"

    println(GlobalName2)



    GlobalName3 = "globalname3 context"

    println(GlobalName3)

    GlobalName3 = null

    print(GlobalName3)

}


