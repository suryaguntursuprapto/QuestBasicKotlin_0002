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