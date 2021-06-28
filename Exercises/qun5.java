package com.company.radiance.Exercises;
import java.util.Scanner;

public class qun5 {
    public static void main(String[] args) {
//      use Comparison opertaors to find out whether a given number is greater then the user entered number or not.

        Scanner sc = new Scanner(System.in);

//        for greater than
        System.out.println("is your number greater then 50?");
        int z = sc.nextInt();
        System.out.println(z > 50);

//        for less then
        System.out.println("is your number less then 50?");
        int b = sc.nextInt();
        System.out.println(b < 50);

    }
}
