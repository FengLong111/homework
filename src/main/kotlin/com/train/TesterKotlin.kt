package com.train

import sun.security.krb5.internal.Ticket
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var tickets = 0
    while (tickets != -1) {
        print("Please enter number of tickets:")
        tickets = scanner.nextInt()
        if (tickets != -1) {
            print("How many round-trip tickets:")
            var roundtrip = scanner.nextInt()
            val ticke = Train(tickets, roundtrip)
            ticke.print()
            print("If don,t buy anymore please Enter the -1"+"\t")
        }
    }
}
        class Train(var tickets: Int, var roundtrip: Int) {

            fun print() {
                val total = (tickets - roundtrip) * 1000 + (roundtrip * 2000) * 0.9
                println(
                    "Total tickets :" + tickets + "\n"
                            + "Round-trip:" + roundtrip + "\n" + "Total:" + total
                );
            }

        }






