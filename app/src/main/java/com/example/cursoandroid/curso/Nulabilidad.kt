package com.example.cursoandroid.curso

fun main(){

    // El ? nos indica que la variable es de tipo nullable, es decir, que la vble puede ser nula
    var name: String? = null

    // De un String podemos acceder a una de sus posiciones
    // Por eso de las lineas de abajo, al decir que escriba la posicion 3 de la variable1 imprimirá
    // la letra g porque es la posicion 3 de la variable
    var variable1: String = "jorge"
    println(variable1[3])
    // Tambien se puede obtener lo mismo de arriba con la linea de abajo
    println(variable1.get(3))

    // El poner !!, lo que estamos diciendo es que sabemos que la vble no va a ser nula
    println(name!![3])

    // En el caso de la linea de abajo, la ? significa si no es nulo haz lo que sea que pone el codigo
    println(name?.get(0))

    // Para completar mas lo de arriba, la parte de ?: en adelante, nos dice en caso de que sea nulo
    // haz esta otra cosa
    println(name?.get(0) ?: "Esto es nulo, no te lo puedo dar")

}