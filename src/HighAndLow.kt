/*
    Created by Md. Shahariar Hafiz
 */

    fun main(args : Array<String>)
    {
        println("*****Enter Space Separated Number")
        val string:String = readLine().toString()
        //Creating a list of String
        val f = string.split(" ")
        //Creating an integer array
        val int: IntArray = f.map { it.toInt() }.toIntArray()
        println("${int.max()} ${int.min()}")
    }