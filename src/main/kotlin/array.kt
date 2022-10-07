


fun main() {

    val interestingThings = arrayOf("Kotlin","Programming","comic")

    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))


    for(i in interestingThings){
       println(i)
    }

    interestingThings.forEach {
        println(it)
    }

    val nums = arrayOf(1,2,3)

    for(i in nums)
    {
        println(i)
    }

    nums.forEach {
        i -> println(i)
    }

    nums.forEachIndexed { index,
                          i -> println("$i is the element in $index th index")

    }




}