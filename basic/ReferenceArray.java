package com.company.basic;

import java.util.Scanner;


public class ReferenceArray
{
    public static void increment(int[] in)
    {
        System.out.println("Increment 1: " + in);
        in = new int[8];
        System.out.println("Increment 2: "+ in);
//        int[] out = in;
//        System.out.println(out);

        //int in[] = {1,2,3,4};
    }
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        System.out.println("First Array: "+ arr);
        increment(arr);
        System.out.println("   "+ arr);
        arr = new int[8];
        System.out.println("Second Array: "+ arr);
        System.out.println(arr);

    }
}
