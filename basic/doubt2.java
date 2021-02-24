package com.company.basic;

import java.util.Scanner;

public class doubt2
{
    static Scanner scan = new Scanner(System.in);
    public static void get1(int[] array)
    {
        for(int i = 0; i<array.length;i++)
        {
            array[i] = scan.nextInt();
        }

    }
    public static void get2(int[] array)
    {
        for(int i = 0; i<array.length;i++)
        {
            array[i] = scan.nextInt();
        }
    }
    public static void printArray(int[] array)
    {
        for(int i = 0; i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args)
    {
        int[]  arr = new int[6];
        int[] a = new int[3];
        get1(arr);
        get2(a);
        printArray(arr);
        printArray(a);
    }
}
