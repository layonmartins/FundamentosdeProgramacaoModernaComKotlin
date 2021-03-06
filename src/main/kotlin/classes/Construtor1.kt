package classes

class Filme {
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String = "Drama") {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme("O poderoso Chefão", 1972)
    println("O ${filme.genero} ${filme.nome} foi lançado em ${filme.anoLancamento}.")
}