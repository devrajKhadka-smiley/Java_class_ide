package com.company.radiance.Exercises;
import java.util.Scanner;
public class qun9 {
    public static void main(String[] args) {
//        write a pogram to detect whether a number entered by a user is int or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit:");
        System.out.println("The Entered digit above is Integer: " + sc.hasNextInt());

    }
}
