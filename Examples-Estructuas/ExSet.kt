fun main() {
    // creamos dos conjuntos, uno de numeros pares y otro de impares
    val peers = mutableSetOf(2,4,6,8,10,12,14,16,18,20)
    val odd = mutableSetOf(1,3,5,7,9,11,13,15,17, 19)


//se utiliza la función "union" para combinar los dos conjuntos y crear uno nuevo que contenga todos los elementos. A continuación, se utiliza la función "filter" para seleccionar solo los elementos que sean múltiplos de 3, se utiliza la función "sorted" para organizar los numeros en orden ascendente
    val multiplesOfThree = peers.union(odd).filter{it % 3 ==0}.sorted()

// se recorre el conjunto utilizando un bucle "for" para imprimir cada elemento en la consola.
    println("Multiplos de 3:")
    for (element in multiplesOfThree) {
        println(element)
    }

}