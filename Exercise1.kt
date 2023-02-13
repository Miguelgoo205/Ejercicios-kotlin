//La tienda "Mis Zapatos" está de aniversario, por esa razón se está realizando un descuento del 50% en compras mayores o iguales a los $ 100.000. Haga un algoritmo que permita validar cuando se debe aplicar un descuento a un cliente, en caso de que el descuento sea valido se debe informar al usuario indicando el valor descontado.

//comando compilador del codigo
//kotlinc Exercise1.kt -include-runtime -d Exercise1.jar 
//comando para ejecutar el codigo
//java -jar Exercise1.jar

fun main (){
    println("Ingrese el valor de la compra:")

    var valorCompra = readLine()!!.toDouble()

    if(valorCompra >= 100000){
        var descuento = valorCompra * 0.5
        valorCompra -=descuento
        println("Se aplico un descuento del 50% equivalente a: $descuento")
    }
    println("Su total a pagar es de $valorCompra")
}