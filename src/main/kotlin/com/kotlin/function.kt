package com.kotlin

fun main() {
    println(fun1(1, 2));
    println(fun2(1, 2));
    println(fun3(1))
}

fun fun1(x: Int, y: Int): Int {
    return x + y;
}

fun fun2(x: Int, y: Int) = x + y

/*
Here it is not mandatory for caller to pass second parameter
 */
fun fun3(x: Int, y: Int = 2) = x+y