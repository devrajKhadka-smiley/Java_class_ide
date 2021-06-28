package com.company.radiance.Exercises;
import java.util.Scanner;

public class qun1 {

/*  Write a program to calcute percentage of a given subject in NEB board exam. His marks from 5 subject must be taken as
    input from keyboard (marks out of 100)
 * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Physics Mark:");
        int a = sc.nextInt();
        System.out.println("Enter Your Chemistry Mark");
        int b = sc.nextInt();
        System.out.println("Enter Your Maths Mark");
        int c = sc.nextInt();
        System.out.println("Enter Your Science Mark");
        int d = sc.nextInt();
        System.out.println("Enter Your Biology Mark");
        int e = sc.nextInt();
        float Perc = (float)(a + b + c + d + e) / 100.0F * 100.0F;
        System.out.println("Total Percent You Obtained is " + Perc + "%");
        System.out.println("Anything you want to say about it ?");
        String str = sc.next();
        System.out.println(str);
        String s1 = sc.nextLine();
        System.out.println(s1);
        System.out.println("Improve from the next time.");
    }
}
