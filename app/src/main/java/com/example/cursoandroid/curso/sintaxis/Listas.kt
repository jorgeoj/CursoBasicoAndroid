package com.example.cursoandroid.curso.sintaxis

fun main(){
    // Tenemos dos tipos de listas: mutables (se pueden cambiar) e inmutables
    // (no se pueden cambiar, son de solo lectura)
    inmutableList()
    mutableList()
}

fun inmutableList(){
    // Como se declara una lista inmutable: nombreLista: List<TipoValoresAAlmacenar> = listOf(valores)
    val readOnly: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    // A contrario del array, la lista si imprime directamente todos los valores de esta (no hacen falta bucles)
    // Esto hace exactamente los mismo que la linea de abajo:  println(readOnly.toString())
    println(readOnly)

    // Para acceder a una posicion en concreto:
    // Tambien existe .last(), para dar la ultima poscion de la lista y .first() para el primero
    println(readOnly[5])

    // Con las listas podemos filtrar: it va a ser los valores de cada posicion de la lista y le
    // decimos que queremos filtrar, en este caso que contenga "a"
    val example = readOnly.filter { it.contains("a") }
    println(example)

    // Aqui recorremos la lista e imprimimos cada valor, pero en este caso hemos puesto weekDay -> y
    // que imprima weekDay, weekDay en este caso es como el it de ko que hemos hecho antes, pero hemos
    // hecho una lambda para cambiarle el nombre para que sea mas legible
    readOnly.forEach{weekDay -> println(weekDay) }
}

fun mutableList(){
    // Como se declara una lista inmutable: nombreLista: MutableList<TipoValoresAAlmacenar> = mutableListOf(valores)
    var weekDays: MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    // Podemos añadir valores a la lista, y ponerle un indice para colocarlo en una posicion concreta
    weekDays.add(4, "Juernes")
    println(weekDays)
}