package com.plurasight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.print("Please enter first and last name:");
        String[] name = keyboard.nextLine().trim().split(Pattern.quote(" "));
        String firstName = name[0];
        String lastName = name[1];

        System.out.print("What date will you coming (MM/dd/yyyy):");
        LocalDate date = LocalDate.parse(keyboard.nextLine().trim(),formatter);
        System.out.print("How many tickets would you like?: ");
        int ticketAmount = Integer.parseInt(keyboard.nextLine().trim());



        System.out.printf("%d ticket(s) reserved for %s under %s, %s.", ticketAmount,date,lastName, firstName);
    }
}
