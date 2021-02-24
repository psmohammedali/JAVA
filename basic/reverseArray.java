package com.company.basic;

import java.util.Scanner;

public class reverseArray
{

    public static int[] getArray(int n)
        {
            Scanner scan = new Scanner(System.in);
            int[] a = new int[n];
            for(int i = 0; i<a.length;i++)
            {
                a[i] = scan.nextInt();
            }
            return  a;
        }
    public static int[] reverse(int[] array)
    {
        int[] resultArray = new int[array.length];
        int index = array.length - 1;
        for(int i = 0; i<resultArray.length;i++)
        {
            resultArray[i] = array[index - i];
        }
        return resultArray;
    }
    public static void print(int[] array)
    {
        System.out.print("The given array is: ");
        for(int i = 0;i<array.length;i++)
        {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
    public static void printReverse(int[] array)
    {
        System.out.print("The revese array for the given array is: ");
        for(int i = 0;i<array.length;i++)
        {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = scan.nextInt();

        int[] arr = getArray(size);
        print(arr);
        int[] res = reverse(arr);
        printReverse(res);

    }
}
