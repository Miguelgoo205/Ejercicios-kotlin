// 2. Haga una lista que permita almacenar el valor de 3 notas y obtenga el promedio de ellas.
fun main(){
// declaracion de variables
// Declaramos una lista mutable de notas de tipo Double
val notes = mutableListOf<Double>() 
var note: Double
var addition=0.0
var average: Double
// Pedimos al usuario que ingrese las 3 notas y las agregamos a la lista
for (i in 1..3) {
    println("Ingrese la nota ${i}")
        note= readLine()!!.toDouble()
        if (note>5 || note<0){
            println("Valor invalido")
            break
        }
        else{
            notes.add(note)
            addition+= note  
        }
}
        // imprimimos las notas
        println(notes)
        // Calculamos el promedio de las notas
        average= notes.average()
        // imprimimos el promedio
        println("El promedio de sus notas es de: $average")
}