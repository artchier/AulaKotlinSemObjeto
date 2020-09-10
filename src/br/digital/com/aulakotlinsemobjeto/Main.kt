package br.digital.com.aulakotlinsemobjeto

fun main() {

    imprime100Negativos()
}

fun maior(numero1: Int, numero2: Int, numero3: Int): Int {
    if (numero1 > numero2 && numero1 > numero3)
        return numero1
    else if (numero2 > numero1 && numero2 > numero3)
        return numero2
    return numero3
}

fun compara(frase1: String, frase2: String): Boolean {
    return frase1 != frase2
}

fun par(numero: Int): Boolean {
    return numero % 2 == 0
}

fun imprime100Negativos() {
    for (num in 1..200) {
        if (num % 2 != 0)
            print("$num\t")
    }
}

fun maiorNumeros(a: Int, b: Int, c: Int, d: Int): Boolean {
    return (a > c && a > d) || (b > c && b > d)
}

fun imprime100() {
    for (num in 1..100)
        println(num)
}