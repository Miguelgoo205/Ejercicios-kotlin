//Condicionales anidadas

//Ejercicio
//Algoritmo que calcule solicite el nombre y la materia de un estudiante, así como 3 notas parciales y con esto calcule el promedio de notas, valide que si el estudiante saca un promedio mayor o igual a 3.5 entonces indique que el estudiante ganó la materia, de lo contrario indique que la perdió, en caso de perderla valide si se perdió con una nota mayor a 2.5 entonces el estudiante puede recuperar, el mensaje deberá mencionar el nombre y la materia del estudiante.


fun main (){
    println("Ingrese su nombre: ")
    val name = readLine()!!.toString()

    println("Ingrese la materia: ")
    val subject = readLine()!!.toString()

    println("Ingrese la nota 1:")
    val note1 = readLine()!!.toFloat()
    println("Ingrese la nota 2:")
    val note2 = readLine()!!.toFloat()
    println("Ingrese la nota 3:")
    val note3 = readLine()!!.toFloat()
    
    val average = (note1+note2+note3)/3
    println("El promedio de sus notas es: $average")

    if(average>=3.5){
        println("El estudiante $name Gano la materia $subject")
    }
    else{
        println("El estudiante $name Perdio la materia $subject")
        if(average>=2.5){
            println("$name puede recuperar")
        }
    }
}
