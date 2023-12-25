package IIBasicoControleFluxo

fun maiorDeIdade(idade: Int): String {
    return if (idade >= 18) {
        "Maior de idade."
    } else {
        "Menor de idade."
    }
}

fun maiorDeIdadeLinha(idade: Int): String = if (idade >= 18) "Maior de idade." else "Menor de idade."

fun bonusFuncionario(anosEmpresa: Int) {
    if (anosEmpresa >= 0) {
        println("Bônus padrão: R$100,00")
    } else {
        if (anosEmpresa >= 1 && anosEmpresa < 3) {
            println("Bônus: R$200,00")
        } else if (anosEmpresa >= 3 && anosEmpresa < 5) {
            println("Bônus: R$300,00")
        } else {
            println("Bônus: R$800,00")
        }
    }
}

fun main() {
    println(maiorDeIdade(15))
    println(maiorDeIdade(26))

    bonusFuncionario(1)
    bonusFuncionario(2)
    bonusFuncionario(3)
    bonusFuncionario(4)
    bonusFuncionario(5)

    val str : String? = null
    val verif = if (str == null) "NULO" else str
    val verif2 = str ?: "NULO"
}
