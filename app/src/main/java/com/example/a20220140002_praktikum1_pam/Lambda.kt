package com.example.a20220140002_praktikum1_pam

// Lambda Functions adalah fungsi yang tidak memiliki nama
// Lambda Fuctions biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda functions menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String{
    return string.uppercase()
}

//dapat ditulis dalam ekspresi lambda sbb:
fun main(){
    uppercaseString("Hello")
    println({string: String -> string.uppercase() } ("Hello"))
    //HELLO
}