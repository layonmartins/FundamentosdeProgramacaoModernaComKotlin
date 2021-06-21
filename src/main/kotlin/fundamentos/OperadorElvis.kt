package fundamentos

fun main() {
    val opcional: String? = null
    val obrigatorio: String = opcional ?: "valor padrão"

    println(obrigatorio)
}