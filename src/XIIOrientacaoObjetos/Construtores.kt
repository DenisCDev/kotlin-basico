package XIIOrientacaoObjetos

class Pessoa4(val nome: String) {

    var idade: Int? = null

    constructor(n1: String, idade: Int) : this(n1) {
        this.idade = idade
    }

    fun saudacoes() {
        println("Meu nome é $nome e tenho $idade")
    }

}

class PessoaPrivada private constructor()


fun main() {

    val p1 = Pessoa4("Gabriel")
    println(p1.idade)

    val p2 = Pessoa4("Gabriel", 20)
    println(p2.idade)

}