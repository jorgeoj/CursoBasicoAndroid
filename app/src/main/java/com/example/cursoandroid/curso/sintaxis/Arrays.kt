package com.example.cursoandroid.curso.sintaxis

fun main(){
    // Un array es una secuencia de datos
    // Se define un array de la siguiente forma
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    // Imprimimos un valor concreto segun su posicion
    // La pimera posicion es el 0
    println(weekDays[0])

    // La linea de abajo imprime el tamaño que tiene el array
    println(weekDays.size)

    // Bucles para recorrer arrays:
    // Forma 1 -> para cada posicion en los indices de mi array (solo nos interesa la posicion)
    for (position in weekDays.indices){
        println(weekDays[position])
    }

    // Forma 2 -> con bucle for, esta da directamente la posicion y el valor (nos interesa la posicion y el valor)
    for ((position, value) in weekDays.withIndex()){
       println("la posicion $position, contiene $value")
    }

    // Forma 3 -> nos inventamos el nombre de una variable "weekDay" en este caso (puede ser otro nombre)
    // y accede a los valores de cada posicion del array (nos interesa solo el valor)
    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }

}