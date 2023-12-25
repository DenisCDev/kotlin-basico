package XIIOrientacaoObjetos

interface Interface1 {
    fun teste()
    fun ola() {
        println("Olá interface 1!")
    }
}

interface Interface2 {
    fun ola() {
        println("Olá interface 2!")
    }
}

class ImplementsInterface : Interface1, Interface2 {
    override fun teste() {
        println("Sobrescrita")
    }

    override fun ola() {
        super<Interface1>.ola()
    }
}

fun main() {
    val a1 = ImplementsInterface()
    a1.ola()
}