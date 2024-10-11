package com.example.a20220140002_praktikum1_pam

fun nullSafety(){
    //neverNull has string type
    var neverNull:String = "This can't be null"

    //throws a compiler error
    //neverNull = null

    //nullable has nullabe string type
    val nullable: String? = "You can keep a null here"

    //this is ok
    //nullable = null

    // Check for null in conditions
    if(neverNull == null){
        println("inferredNonNull is null")
    }else{
        println("inferredNonNull is not null")
    }

    //safe call operator
    println(neverNull.length)//18
    println(nullable?.length)

    //
}