package XIIIColecoes

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes(val nome: String, val quantidade: Int)

fun main() {

    val data = listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingredientes("Farinha", 1),
                Ingredientes("Presunto", 5),
                Ingredientes("Queijo", 10),
                Ingredientes("Molho de tomate", 2),
                Ingredientes("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Pão", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 1),
                Ingredientes("Bacon", 3),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1)
            )
        )
    )

    println("Tenho receitas? ${if (data.any()) "sim" else "não"}.")

    println("Tenho ${data.count()} receitas.")

    println("Tenho receitas de Lasanha? ${if (data.any { it.nome.contains("Lasanha") }) "sim" else "não"}.")

    println("Tenho ${data.count { it.nome.contains("Lasanha") }} receitas de Lasanha.")

    println("A primeira receita é: ${data.first().nome}.")
    println("A última receita é: ${data.last().nome}.")

    val sumCalories = data.sumBy { it.calorias }
    println("A soma de calorias é: $sumCalories")

    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.nome}")
    }

    val knowPanqueke = data.filter { it.nome == "Panqueca" }.any()
    println("Sei fazer panqueca? ${if (knowPanqueke) "sim" else "não"}")

    val knowSushi = data.filter { it.nome == "Sushi" }.any()
    println("Sei fazer sushi? ${if (knowSushi) "sim" else "não"}")

    data.filter { it.calorias > 500 }.forEach { println(it.nome) }

    val maisCal = data.maxBy { it.calorias }
    println("Mais calórica: ${maisCal?.nome}")

    val menosCal = data.minBy { it.calorias }
    println("Menos calórica: ${menosCal?.nome}")

    data.map { it.nome }

    val media = data.map { it.calorias }.average()
    println("A média de calorias é: $media.")

    val listaInteiros = listOf(1, 2, 6, 67, 7, 3, 34, 56, 3, 3, 2, 5, 34, 2)
    println("Lista distinta: ${listaInteiros.distinct()}.")
    println("Máximo: ${listaInteiros.max()}.")
    println("Mínimo: ${listaInteiros.min()}.")

    println(data.distinctBy { it.nome })

    listaInteiros.sorted()
    listaInteiros.sortedDescending()

    listaInteiros.reversed()

}