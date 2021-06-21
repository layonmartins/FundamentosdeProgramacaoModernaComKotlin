package fundamentos.controles

fun main(args: Array<String>) {
    val note: Double = 8.3

    // Usando operador range
    if (note in 9.0..10.0) {
        println("Fantástico")
    } else if(note in 7.0..8.0) {
        println("Parabéns")
    } else if (note in 4.0..6.0) {
        println("Tem como recuperar")
    } else if (note in 0.0..3.0){
        println("Te vejo no próximo semestre")
    } else {
        println("Nota inválida")
    }

    println(5 in 7..4) //falso porque o range é do menor para maior
    println(5 in 4..7)
}