package com.company.radiance;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("make it Large!");

//        byte (-2^8)/2 to (2^8)/2-1
        byte age = -128;
        System.out.println(age);

//        short (-2^16)2 to (2^16)/2 - 1
        short father = 32767;
        System.out.println(father);

//        int (-2^32)/2 to (2^32)/2 - 1
        int mother = 2147483647;
        System.out.println(mother);

//        long (-2^64)/2) to (2^64)/2 - 1
        long son = 1000000000L;
        System.out.println(son);

//        from 0 to (2^16) - 1
        char friend = 'A';
        System.out.println(friend);

//        float 8 byte
        float f1 = 0.01F;
        System.out.println(f1);

//        double 8 bytes
        double d1 = 0.01D;
        System.out.println(d1);
    }
}
