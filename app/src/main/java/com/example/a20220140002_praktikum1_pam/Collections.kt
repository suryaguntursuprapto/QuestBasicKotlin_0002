package com.example.a20220140002_praktikum1_pam

// List adalah kumpulan data yang disusun secara berurutan dari
// List bersifat ordered artinya data yang dimasukkan akan memiliki posisi urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan ListOf
// List Mutable menggunakan mutableListOf

fun ContohList(){
    println("=== LIST ===")
    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //menambahkan data ke dalam list mutable'
    shape.add("Circle")
    println(shape)

    //menghapus data dari list mutable
    shape.remove("Triangle")
    println(shape)

    //mengubah data didalam list mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Onlye
    val shapesLocked: List<String> = shape
    println(shapesLocked)

}


// Set Adalah sekumpulan data yang tidak memiliki posisi atau urutan dan hanya menyimpan data unik(tidak ada duplikasi)
// Set bersifat unardered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah, dan tidak dapat diubah
// Set Read-Only menggunakan setOf
// Set Mutable menggunakan mutableSetOf

fun ContohSet(){
    println()
    println("=== Set ===")

    // Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")

    // Set Mutable
    val  shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    // menambahkan data kedalam Set Mutable
    shape.add("Rectangle")
    println(shape)

    // Menghapus data dari set Mutable
    shape.remove("Circle")
    println("shape")

    // Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

// Map adalah kumpulan data yang disusun dalam pasangan key-value
// Map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Map Read-Only menggunakan mapOf
// Map Mutable menggunakan mutableMapOf

fun ContohMap(){
    println()
    println("=== Map ===")

    //Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    // Map mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    // Menambahkan data ke dalam Map Mutable
    shape["Rectangle"] = 4
    println(shape)

    // Menghapus data dari Map Mutable
    shape.remove("Circle")
    println(shape)

    // Mengubah data di dalam Map Mutable
    shape["Square"] = 5
    println(shape)

    // Map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)

}