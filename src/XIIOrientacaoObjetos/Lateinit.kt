package XIIOrientacaoObjetos

class Pessoa7 {
    lateinit var nome: String

    fun geradorDeNome() {
        nome = ""
    }
}

fun main() {

    val p = Pessoa7()
    p.geradorDeNome()

    println(p.nome)

}