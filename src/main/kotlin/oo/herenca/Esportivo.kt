package oo.herenca

interface Esportivo {

    var turbo: Boolean

    fun ligarTurbo(){
        turbo = true
    }

    fun desligarTurbo() {
        turbo = false
    }
}