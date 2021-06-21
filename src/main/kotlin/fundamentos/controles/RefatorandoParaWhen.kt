package fundamentos.controles

fun main() {
    val nota = 5

    print(
        when(nota){
            10, 9 -> "Fantástico"
            8, 7 -> "Parabéns"
            6, 5, 4 -> "Tem como recuperar"
            in 0..3 -> "Te vejo no próximo semestre"
            else -> "Nota inválida!"
        }
    )
}