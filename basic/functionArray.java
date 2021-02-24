package com.company.basic;

import java.util.Scanner;

public class functionArray
{
    public static int[] getArray()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        //getting value from user for every index of the arr
        for(int i = 0;i<size;i++)
        {
            System.out.println("Enter the "+ i + "th index: ");
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr2)
    {
        int size = arr2.length;
        for(int i = 0; i<size;i++)
        {
            System.out.println("The value at "+i+ " th index is" + arr2[i]);
        }
    }
    public static void finalArray()
    {
        int[] a = getArray();
        printArray(a);
    }

    public static void main(String args[])
    {
        finalArray();
    }
}
