package XIIOrientacaoObjetos

class Pessoa6(val anoNascimento: Int) {

    var nome: String = ""
        get() {

            println("Meu valor é $field")
            return field

        }
        set(value) {
            if (value == "") {
                println("Toda pessoa deve ter um nome.")
            } else {
                field = value
            }
        }

}