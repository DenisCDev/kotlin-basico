package IBasicoAmbienteConceitos

fun helloWorld() {
    println("Olá mundo mais uma vez em kotlin!")
}

fun meuNome(nome: String) {
    println("Olá $nome!")
}

fun meuNomeIdade(nome: String, idade: Short) {
    println("Olá $nome! Tenho $idade anos.")
}

fun letraIndice(nome: String, indice: Int): Char {
    return nome[indice]
}

fun main() {
    helloWorld()
    meuNome("Denis")
    meuNomeIdade("Denis", 19)
    letraIndice("Denis", 0)

    var str1 = "Convidado"
    var str2 = "Olá #{str1}"

}
