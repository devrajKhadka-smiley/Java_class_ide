package com.company.radiance.Exercises;

public class qun3 {
    public static void main(String[] args) {

        /* write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the xorrect grade.
        * */

        char grade = 'A';
        char grede = (char)(grade + 8);
        System.out.println("Encrypted form of my  grade is: " + grede);
        grede = (char)(grade -8);
        System.out.println("Decrypted form o fmy grade is: " + grade);

    }
}
