fun main() {
//Creamos un mapa mutable de nombres y edades
    val people = mutableMapOf("Natalia" to 20, "Mariana" to 19, "Leonel" to 34, "Miguel" to 17)
// Le preguntamos al usuario de que persona quiere saber la edad
    println("De que persona deseas saber la edad: ")
// Almacenamos el nombre para utilizarlo como llave
    val name = readLine()
// guardamos la edad a traves de la llave en este caso el nombre, si el nombre no esta el resultado de age es null
    val age = people[name]
// Validamos que la persona este registrada en el hasmap para poder brindar la informacion
    if (age != null) {
        println("La edad de $name es $age")
    } else {
        println("No se encontró el nombre $name en la lista")
    }
}