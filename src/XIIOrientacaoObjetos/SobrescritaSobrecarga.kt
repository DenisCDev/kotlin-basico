package XIIOrientacaoObjetos

open class Maquina2(val marca: String) {
    open fun minhaMarca() {
        println("Sou da marca: $marca")
    }

    private fun somenteMaquina() {
        println("Esse método é acessível somente por instâncias da classe Maquina.")
    }
}

class Computador2(marca: String, val nucleos: Short) : Maquina2(marca) {

    override fun minhaMarca() {
        println("Minha marca é $marca e tenho $nucleos núcleos.")
    }

    fun overload(a: String) = println("Overload 1")

    fun overload(a: Int) = println("Overload 2")

    fun overload(a: Int, b: Int) = println("Overload 3")

}


fun main() {

    val comp = Computador2("AlienWare", 4)
    comp.minhaMarca()
    comp.nucleos
    comp.overload("1")
    comp.overload(1)
    comp.overload(1, 2)

}