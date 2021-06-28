package com.company.radiance.Exercises;
import java.util.Scanner;
public class qun8 {
    public static void main(String[] args) {
//        write a program to conver kilometer to meter

            Scanner sc = new Scanner(System.in);

        System.out.println("Enter the kilometer in digit");
        float a = sc.nextInt();
        float b = a * 0.621371F;
        System.out.println("Entered distance in miles is: " + b);
    }
}
