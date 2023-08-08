package org.example;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1-12 to find Month.");
        int month=sc.nextInt();
        String monthString="";
        switch (month) {
            case 1 -> monthString = "1 - January";
            case 2 -> monthString = "2 - February";
            case 3 -> monthString = "3 - March";
            case 4 -> monthString = "4 - April";
            case 5 -> monthString = "5 - May";
            case 6 -> monthString = "6 - June";
            case 7 -> monthString = "7 - July";
            case 8 -> monthString = "8 - August";
            case 9 -> monthString = "9 - September";
            case 10 -> monthString = "10 - October";
            case 11 -> monthString = "11 - November";
            case 12 -> monthString = "12 - December";
            default -> System.out.println("Invalid Month!");
        }
        System.out.println(monthString);
    }
}
