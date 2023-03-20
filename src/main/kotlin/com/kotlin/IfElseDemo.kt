package com.kotlin

class IfElseDemo {

}
fun main() {
    val a = 3
    val x = if( a ==1){
        println("one");
    } else if(a == 2){
        println("two")
    } else {
        println("three")
    }

    val value = when(3){
        1 -> "one"
        2-> "two"
        3-> "three"
        else -> "Not found"
    }
    println(value);
}