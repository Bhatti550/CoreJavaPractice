package org.example;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.print("Enter your Age");
        age=sc.nextInt();
        if(age>18){
            System.out.print("Age is greater than 18.");
        }
        else {
            System.out.print("Age is less than 18.");
        }
    }
}
