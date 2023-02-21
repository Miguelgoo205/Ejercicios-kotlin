// Dado un par de valores enteros, crear una lista que contenga todos los números enteros entre el primer y el segundo valor del par.

fun main() {
    // Creamos el par con ambos valores enteros, tambien la lista para almacenar los numeros
    val pair = Pair(2, 19)
    val numbers = mutableListOf<Int>() 
    // Creamos un ciclo for el cual empezara desde el primer elemento del par hasta el ultimo, para recorrer el rango entre estos dos, dentro del ciclo almacenaremos los numeros en la lista
    for (i in pair.first..pair.second) {
        numbers.add(i)
    }
    // Imprimimos la lista para verificar que se hayan alamcenado los nuemros dentro del rango
    println("Los numeros entre ${pair.component1()} y ${ pair.component2()} son:")
    println(numbers)
}


