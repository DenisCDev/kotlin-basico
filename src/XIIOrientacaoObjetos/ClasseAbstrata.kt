package XIIOrientacaoObjetos

abstract class Mamifero(val nome: String) {

    private var peso = 0f

    abstract fun talk()
    open fun nome() {
        println("Sou um mamífero: $nome")
    }
}

class Cachorro(especie: String) : Mamifero(especie) {
    override fun talk() {
        println("Au au")
    }

    override fun nome() {
        super.nome()
    }
}

fun main() {
    val cachorro = Cachorro("Bingo")
    cachorro.talk()
    cachorro.nome()
}