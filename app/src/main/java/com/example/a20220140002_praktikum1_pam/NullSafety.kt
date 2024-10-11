package com.example.a20220140002_praktikum1_pam

fun nullSafety(){
    //neverNull has string type
    var neverNull:String = "This can't be null"

    //throws a compiler error
    //neverNull = null

    //nullable has nullabe string type
    val nullable: String? = "You can keep a null here"

}