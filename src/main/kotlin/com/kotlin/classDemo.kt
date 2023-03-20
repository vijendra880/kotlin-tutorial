package com.kotlin

class Dummy {
    fun method1() {
        println("Printing....")
    }

}

fun main() {
    var intance = Dummy() // class initialization without new keyword
    intance.method1()

    var user = User(1, "vijendra") // using primary constructor
    user.printDetail()
    println(user.userId)

    var user1 = User1(2, "Gautam")
    user1.printDetail()
}

/*
Primary constructor
 */

class User(var userId: Int, var name: String) {
    fun printDetail() {
        println("userId: $userId, name: $name")
    }

}


class User1() {
    private var userId: Int = 0
    private var name: String = ""

    init {
        println(name)
    }

    fun printDetail() {
        println("userId: $userId, name: $name")
    }

    /*
    Secondary constructor
     */
    constructor(userId: Int, name: String) : this() {
        this.userId = userId
        this.name = name;
    }


}



