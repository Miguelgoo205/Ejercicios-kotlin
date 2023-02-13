// ciclo do while

//EJERCICIO
//Haga un algoritmo que solicite el nombre de n cantidad de personas que llegan a una clase, se permitirá el ingreso hasta que el usuario decida, el sistema deberá indicar al final la cantidad de personas que llegaron

fun main(){
    var answer: String
    var cant = 0
    do{
        println("\n Ingrese el nombre")
        val name = readLine()!!
        println("Hola $name bienvenido a la clase!")
        cant++
        println("Ingrese si, si hay mas personas")
        answer = readLine()!!

    }while(answer=="si")

    println("Llegaron $cant personas, disfruten la clase!!")
}