package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticks = 0;
        while (ticks !=-1){
            System.out.print("Please enter number of tickets:");
            ticks= scanner.nextInt();
            System.out.print("How many round-trip tickets:");
            int roundtrip= scanner.nextInt();
            Tickets tickets = new Tickets(ticks, roundtrip);
            tickets.print();
            System.out.print("If don,t buy anymore please Enter the -1");
            ticks= scanner.nextInt();
            }
        }




    }

