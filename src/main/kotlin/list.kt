fun main() {
    val num2 = listOf(1,2,3) // this is immutable
    // we can't add data here

    num2.forEach{
            i -> println(i)
    }

    val num3 = mutableListOf(4,5,6)

    num3.add(5)

    num3.forEach{
        i -> println(i)
    }

}