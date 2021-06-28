package com.company.radiance;
import java.util.Scanner;

public class Scan_from_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        What ever the user want to display.
        System.out.println("Enter the digit to print out of your desire.");
        float a = (float)sc.nextInt();
        System.out.println(a);

//        Adding of the user added digit
        System.out.println("Enter the first digit");
        float x = sc.nextInt();
        System.out.println("Enter the second digit");
        float y = sc.nextInt();
        float z = x + y;
        System.out.println("Addition of the above digit is " + z);

//        Subtraction of the user added digit
        System.out.println("Enter the first digit");
        float c= sc.nextInt();
        System.out.println("Enter the second digit");
        float d = sc.nextInt();
        float e = c - d;
        System.out.println("Subraction of the above digit is " + e);

//        Multiplication of the user added digit
        System.out.println("Enter the first digit");
        float g= sc.nextInt();
        System.out.println("Enter the second digit");
        float h = sc.nextInt();
        float i = g * h;
        System.out.println("Subraction of the above digit is " + i);

//        Division of the user added digit is
        System.out.println("Enter the first digit");
        float j= sc.nextInt();
        System.out.println("Enter the second digit");
        float k = sc.nextInt();
        float l = j / k;
        System.out.println("Subraction of the above digit is " + l);

//        Data to analysis
        System.out.println("Enter the Digit to analys");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        String str = sc.next();
        System.out.println(str);
        String s1 = sc.nextLine();
        System.out.println(s1);
    }
}
