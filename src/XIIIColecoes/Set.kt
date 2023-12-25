package XIIIColecoes

fun main() {

    val set = setOf("Grécia", "Portugal", "Itália")
    val s11: Set<Int> = setOf(1)

    val setMutavel = mutableSetOf(1, 2, 3, 4, 5, 5, 5, 5, 5, 5)

    println(setMutavel)

    setMutavel.add(5)
    setMutavel.add(5)
    setMutavel.add(5)
    setMutavel.add(5)

    println(setMutavel)
}