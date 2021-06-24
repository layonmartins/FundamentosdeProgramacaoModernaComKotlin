package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main() {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)

    println(g1 == g2) //equals of memory reference
    println(g1.toString())

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)

    println(tv1 == tv2) //equals data class
    println(tv1 === tv2) //reference memory
    println(tv1.toString())
    println(tv1.copy()) //copy is only for the data class
    println(tv1.copy(polegadas = 42))

    // Destructuring
    val (marca, pol) = tv1 //it does not work for g1 because it is not a data class
    println("$marca $pol")
}