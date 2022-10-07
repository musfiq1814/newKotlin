fun main() {

    val map = mapOf(1 to "a",2 to "b",3 to "c")
    // it is immutable / we can't add data

    map.forEach {key, value -> println("$key -> $value") }

    val map2 = mutableMapOf(1 to "a",2 to "b",3 to "c")

    map2.put(4,"d")


}