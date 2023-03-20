package com.kotlin

fun main(){
    var instant = dataClassDemo(1, "vijendra");
    println(instant)
}

/*
Automatically generates the equals(), hashCode() and toString methods.
similar to java beans which hold just property and getter,setters., uses for DTO, domain class
 */
data class dataClassDemo(val id: Int, val name: String)