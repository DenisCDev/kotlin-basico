package XIIOrientacaoObjetos

open class Maquina (val marca: String) {
    fun minhaMarca() {
        println("Sou da marca: $marca")
    }

    private fun somenteMaquina() {
        println("Esse método é acessível somente por instâncias da classe Maquina.")
    }
}

class Computador (marca: String, val nucleos: Short) : Maquina(marca)


fun main() {

    val comp = Computador("Alienware", 4)
    comp.minhaMarca()
    comp.nucleos
}