package VMaisSobreTipos

fun AnyExemplo(value: Any) {
    println(value)
}

fun validacao(value: String): Nothing {
    throw Exception(value)
}

fun main() {
    AnyExemplo(1)
    AnyExemplo("Olá!")
    AnyExemplo(108.0F)
    AnyExemplo(listOf(1, 2))
}
