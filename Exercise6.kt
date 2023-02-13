//ciclo while

//Algoritmo que solicite 2 numeros y realice el siguiente proceso del menú
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Finalizar
//Haga el sistema con ciclos y valide que el segundo numero no sea negativo o cero en la opción 4

fun main(){
    var option: Int = 0
    var number1: Float
    var number2: Float

    while(option != 5){
        println("Ingrese el primer numero: ")
        number1= readLine()!!.toFloat()
        println("Ingrese el segundo numero: ")
        number2= readLine()!!.toFloat()

        print("Elija una opcion \n1. Sumar \n 2. Restar \n 3.Multiplicar \n 4. Dividir \n 5. Finalizar \n")
        option= readLine()!!.toInt()
        when(option){
            1 -> println("La suma es: ${number1 + number2}")
            2 -> println("La resta es: ${number1 - number2}")
            3 -> println("La multiplicacion es: ${number1 * number2}")
            4 -> {
                if(number2<=0){
                    println("El segundo numero no puede ser negativo o cero")
                }
                else{
                    println("La division es: ${number1/number2}")
                }
            }
            5 -> println("Gracias por usar este sistema")
            else -> println("Opcion invalida")
        }
    }
}