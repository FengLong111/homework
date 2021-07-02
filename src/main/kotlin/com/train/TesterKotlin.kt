package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:" )
    var tickets = scanner.nextInt()
    print("How many round-trip tickets:")
    var roundtrip = scanner.nextInt()
    val ticket = Train(tickets,roundtrip)
    ticket.print()

}
class Train(var tickets:Int,var roundtrip:Int){

    fun print(){
        val total = (tickets-roundtrip)*1000+(roundtrip*2000)*0.9
                println("Total tickets :"+tickets+"\n"
                +"Round-trip:"+roundtrip+"\n"+"Total:"+total);
    }

}
