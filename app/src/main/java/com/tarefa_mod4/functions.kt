package com.tarefa_mod4

class functions {
}

fun main() {

    //chamando a função soma passando os parametros para soma
     soma(10,20)

    //função compacta
     compact(10,20)

    //calculadora teste inteitos
     calculator(20,20,::soma)

    //calculadora teste multiplicação
     calculator(10,20,::compact)

    //lista de inteiros
    val listNumber = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,89,90,91,92,93,94,95,96,97,98,99)
    //filtragem por numeros pares
    val filtered = listNumber.filter { it % 2 == 0 }
    println(filtered)

    //lista de nomes
    val nomes = listOf("Anderson", "Pedro", "Marcel", "Jaqueline")
    val modnomes = nomes.map { "Olá $it " }
    println(modnomes)

    //percorrendo a lista de nomes com forEach
    modnomes.forEach { println(it) }

}

//função soma dois números inteiros
fun soma(numero: Int, numero2: Int) {
    return println(numero + numero2)
}
//função compacta
fun compact(n1: Int, n2: Int) = println(n1 * n2)

//calculadora
fun calculator(n1: Int, n2: Int, operation: (Int, Int) -> Unit  ) {
  operation(n1,n2)
}