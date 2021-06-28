package com.company.radiance.Exercises;
import java.util.Scanner;
public class qun4 {
    public static void main(String[] args) {
//        write the following expression in java program
//         v^2 -u^2 / 2as

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of v");
        float v = sc.nextInt();
        System.out.println("Enter the value of u");
        float u = sc.nextInt();
        System.out.println("Enter the value of a");
        float a = sc.nextInt();
        System.out.println("Enter the value of s");
        float s = sc.nextInt();

        float Result = (v * v - u * u) / (2 * a * s);
        System.out.println(Result);
    }
}
