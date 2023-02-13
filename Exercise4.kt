//condicional multiple con when

//Haga un algoritmo que solicite el numero de horas trabajadas de un empleado, teniendo que el valor de la hora es igual a $2000 calcule el salario base y realicele un descuento del 10% por concepto de derechos medicos, posteriormente solicite el tipo de empleado y realice el aumento del salario basado en la siguiente tabla: 
//Tipo A - Aumento del 30%
//Tipo B - Aumento del 20%
//Tipo C - Aumento del 10%
 //En caso de que el usuario no tenga un tipo definido, entonces no se le realizará ningún aumento, indique cual seria el salario final basado en los calculos anteriores

 fun main(){
    println("Ingrese el numero de horas trabajadas")
    val hoursWorked = readLine()!!.toInt()
    val hourValue = 2000
    var salary = hoursWorked * hourValue
    println("El salario base es de $salary")
    var medicPorcent = 0.1
    var discount = salary * medicPorcent
    println("Se le realizara un descuento del 10% equivalente a: $discount")
    var totalSalary = salary-discount
    println("Salario neto a pagar aplicando descuento es: $totalSalary ")

    println("Ingrese el tipo de empleado (A,B,C):")
    val type = readLine()
    var porcentAument : Double
    when(type){
        "a", "A" ->{
            porcentAument = 30.0
            println("Es tipo A")
        }
        "b", "B" ->{
            porcentAument = 20.0
            println("Es tipo B")
        }
        "c","C" ->{
            porcentAument = 10.0
            println("Es tipo C")
        }
        else ->{
            println("No se realizara ningun aumento")
            porcentAument=0.0
        }
    }
    if(porcentAument != 0.0){
        var aument = totalSalary*(porcentAument/100)
        totalSalary= totalSalary+aument
        println("Se realizo un aumento de $aument, equvalente al $porcentAument")
        println("El salario final es de $totalSalary")
    }


 }