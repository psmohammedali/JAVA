package com.company.basic;

import java.util.Scanner;

public class function
{
    public static int[] getInput(int[] a)
    {
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i< a.length;i++)
        {
            a[i] = scan.nextInt();
        }
        return a;
    }
    public static void print(int[] a)
    {
        for(int i = 0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static int lar(int[] a)
    {
        int largest = Integer.MIN_VALUE;
        for (int i : a)
        {
            if (largest < i)
                largest = i;
        }
        return largest;
    }
    public static int small(int[] a)
    {
        int smallest = Integer.MAX_VALUE;
        for (int i : a)
        {
            if (smallest > i)
                smallest = i;
        }
        return smallest;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //getting array size
        int n = scan.nextInt();
        //initalizing array
        int[] arr = new int[n];

        int[] getarr = getInput(arr);
        //print(getarr);
        System.out.println(small(getarr));
        System.out.println(lar(getarr));


    }
}
