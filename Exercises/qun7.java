package com.company.radiance.Exercises;
import java.util.Scanner;


public class qun7 {
    public static void main(String[] args) {
//        write a program which ask the user to enter his/her name & greet them with "hello <name> have a great day" text.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " have a great day");
    }
}
