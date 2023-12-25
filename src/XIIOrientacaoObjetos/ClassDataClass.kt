package XIIOrientacaoObjetos

class Quadrado (val area: Float)

data class Triangulo (val area: Float)

fun main() {

    val q1 = Quadrado(10f)
    val q2 = Quadrado(10f)

    val t1 = Triangulo(10f)
    val t2 = Triangulo(10f)

    println(q1.toString())
    println(t1.toString())
    println("----------")

    println(q1 == q2)
    println(t1 == t2)
    println("----------")

    println("${q1.hashCode()} - ${q2.hashCode()}")
    println("${t1.hashCode()} - ${t2.hashCode()}")
    println("----------")

    t1.copy(area = 45f)
}