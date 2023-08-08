package org.example;
import java.util.Scanner;

public class GettingInput {
    static int x;
    static String name;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age:");
        x=sc.nextInt();
        System.out.println("Enter your Name:");
        name=sc.nextLine();
        System.out.println("Your Name is:"+name);
        System.out.println("Your Age is"+x);
        }

    }
