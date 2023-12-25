package IIIMaisConceitos

fun main() {
    try {

        val number = "1".toInt()
        println(number)

        val notANumber = "aa".toInt()
        println("Nem imprime")

    } catch (e: NumberFormatException) {
        println("Erro na conversão de número")
    } catch (e: Exception) {
        println("Algo mais aconteceu")
    } finally {

        println("Funcionou!")
    }
}