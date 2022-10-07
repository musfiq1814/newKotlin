
val name1 = "MRS"

var age1 = 22

val name2 = "Mahi"

var age2 = 10


var speed: Int? = null


fun main() {
   if(name1 != null)
   {
       println(name1)
   }

    if(age1 >= 22)
    {
        println(name1+" is adult now age is "+age1)

    }

    if(age2 <= 18)
    {
        println(name2+" is still picci whose age is "+age2)
    }


    speed = 100

    when (speed)
    {
        null -> println("car is stopped")
        else -> println("car is dynamic")
    }

    //speed = null

    val speedToPrint = if(speed !=null) speed else "Car is stopped"

    //print(speedToPrint)



    val speedToPrint2 = when (speed) {
        null -> println("car is stopped")
        else -> println("car is dynamic")
    }
    


}