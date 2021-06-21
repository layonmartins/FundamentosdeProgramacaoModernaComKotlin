package fundamentos.operadores

fun main() {
    val valor = "abc"

    if(valor is String){
        println(valor)
    } else if (valor !is String) { //não precisa desse else if, é apenas para mostrar que é possivel usar o "!is" operador
        println("Não é uma String")
    }
}