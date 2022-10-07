

fun drive()
{
    println("Car is running")
}

fun driveatSpeed(): Int{
    return 5

}

fun getGreetings(): String{
    return "Welcome"
}

// unit is a type when function doesn't return anything

fun sayHello(): Unit {
    println(getGreetings())

}


fun singleLineFuntion(): String = "this is a single line"

fun simpleFunction() = "simple line"

fun main() {
   println("hi")
    drive()
    println(driveatSpeed())

    speed = driveatSpeed()

    println(speed)

    println(getGreetings())

    sayHello()

    println(singleLineFuntion())

    println(simpleFunction())

}