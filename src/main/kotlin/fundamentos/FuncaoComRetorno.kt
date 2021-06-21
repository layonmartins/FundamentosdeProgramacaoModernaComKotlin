package fundamentos

// obs: parametro com valor default

fun soma(a: Int, b: Int = 1): Int {
    return a + b
}

fun main() {
    println(soma(2, 3))
    println(soma(2))
}
