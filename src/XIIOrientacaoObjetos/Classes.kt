package XIIOrientacaoObjetos

class Pessoa1

class Pessoa2(var nome: String, val anoNascimento: Int)

class Pessoa3(var nome: String, val anoNascimento: Int, val fome: Boolean = false) {
    fun saudacao() {
        println("Meu nome é $nome")
    }
}