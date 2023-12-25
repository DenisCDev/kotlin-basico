package IBasicoAmbienteConceitos

fun main() {

    val kotlin = "Kotlin " + "é brabo"
    println(kotlin)

    val nome2 = """Denis
        |Scarabelli
        |Alho
    """.trimMargin()

    println("Meu nome é $nome2")
    println("Tamanho do meu nome: ${nome2.length} caracteres.")

    val linguagem = "Kotlin"
    val caracteristica = "É bala na agulha!"
    val strFinal = linguagem + " " + caracteristica
    println("$linguagem $caracteristica")

}