//Ciclo for

//Ejercicio
//Haga un algoritmo que solicite n números e indique si son positivos o negativos, también debe indicar si tiene uno o más de 2 dígitos

fun main (){
    println("Ingrese la cantidad de veces a repetir: ")
    val cant = readLine()!!.toInt()
    for (i in 0 until cant) {
        print("Ingrese el primer numero: ")
        val number1 = readLine()!!.toInt()
        print("Ingrese el segundo numero: ")
        val number2 = readLine()!!.toInt()

        val addition = number1+number2
        println("La suma es $addition")

        when{
            addition>=10 -> println("La suma es mayor o igual a dos digitos y es un numero positivo")
            addition<0 ->{
                println("La suma arrojo un valor negativo")
                if(addition<= -10){
                    println("La suma es mayor o igual a dos digitos y es negativo")
                }
                else if(addition==0){
                    println("La suma es igual a cero")
                }
                else{
                    println("La suma arroja un valor de un digito")
                }
            }
            else -> println("La suma arroja un valor de un dijito y es positivo")
        }
    }
}
