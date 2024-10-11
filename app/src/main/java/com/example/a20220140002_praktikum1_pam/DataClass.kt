package com.example.a20220140002_praktikum1_pam

// Data class adalah class yang digunakan yntuk menyimpan data.
// Data class menyediakan fungsi untuk meng-override fungsi equals(), hashCode(). dan toString()
// Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan.

data class DataClass(
    val id: Int,
    var email: String
)

fun main(){
    val data = DataClass(1, "indra@gmail.com")
    println(data)

    //fungsi Equals
    val data2 = DataClass(1,"makan@gmail.com")
    println(data == data2)//false

    //fungsi Copy
    val data3 = data.copy()
    println(data3)

    //fungsi copy dengan perubahan
    val data4 = data.copy(email = "Sahar@gmail.com")
    println(data4)
}