// 1. Haga un arreglo que permita almacenar el valor de 5 números enteros y obtenga la sumatoria.

fun main() {
    // declaramos una variable number para almacenar el numero ingresado por el usuario para guardarlo en el arreglo y para sumarlo en la variable addition
    var number: Int
    var addition =0
    var array= IntArray(5)
    // creamos un ciclo para iterar sobre los índices del arreglo y preguntar al usuario por cada valor utilizando la función readLine(). 
    for (i in array.indices) {
        println("Ingrese el numero en la posicion $i")
        number= readLine()!!.toInt()
        // cada dato es almacenado en el arreglo y se suma en la variable addition
        array[i]=number
        addition+=number
    }
    // mostramos todos los elementos dentro del arreglo
    println("Los numeros del arreglo son: ")
    for (i in array) {
        println(i)
    }
    // imprimimos la suma de los elementos
    println("La suma de los elementos es de: $addition")
}