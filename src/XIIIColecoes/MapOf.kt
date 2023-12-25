package XIIIColecoes

fun main() {

    val map1 = mapOf(Pair("Argentina", "Bariloche"), Pair("Argentina", "Bariloche"))
    val map2 = mutableMapOf(Pair("Argentina", "Bariloche"), Pair("Argentina", "Bariloche"))

    println(map1.keys)

    println(map1.values)

    map2["Alemanha"] = "Berlim"
    println(map2)

    map2.remove("Alemanha")
    println(map2)

}