package com.example.a20220140002_praktikum1_pam

// Conditional Expression adalah ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
// Conditional expression menggunakan if-else, when, dan try-catch
fun ConditionalStatement(){
    println("=== Conditional Expression ===")

    // If-Else
    val number = 10
    if (number > 0){
        println("Positive number")
    }else{
        println("Negative number")
    }

    //when
    val day = 1
    when (day){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Friday")
        6 -> println("Saturday")
        else -> println("Invalid Day")
    }
}