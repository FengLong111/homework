package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets:");
        int tick= scanner.nextInt();
        System.out.print("How many round-trip tickets:");
        int roundtrip= scanner.nextInt();
        Tickets tickets = new Tickets(tick, roundtrip);
        tickets.print();
    }
}
