package XIIOrientacaoObjetos

fun main() {
    val str = "Aprendendo kotlin"

    str.capitalize()
    str.toUpperCase()
    str.decapitalize()
    str.toLowerCase()

    with(str) {
        capitalize()
        toUpperCase()
        decapitalize()
        toLowerCase()
    }
}