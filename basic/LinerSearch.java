package com.company.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LinerSearch
{
    static Scanner scan = new Scanner(System.in);

    // ------------------- ARRAY CREATION ---------------

    public static int[] createArray(int num)
    {
        int[] array = new int[num];

        System.out.println("Please Enter "+num+" values: ");
        for(int i = 0;i<array.length;i++)
        {
            System.out.println("Enter the "+i+ " Index: ");
            array[i] = scan.nextInt();
        }
        return array;
    }
    // ------------------- LINEAR SEARCH ---------------
    public static int linearSearch(int[] array)
    {
        System.out.println("Enter the value that you want index: ");
        int x = scan.nextInt();
        int i = 0;
        while(i<array.length)
        {
            if(array[i]== x)
            {
                return i;
            }
            i++;
        }
        return -1;
    }

    // ------------------- DRIVER CODE ---------------
    public static void main(String[] args)
    {

        System.out.println("Enter the Array Size: ");
        int size = scan.nextInt();
        int[] arr = createArray(size);
        int result = linearSearch(arr);
        System.out.println("The index is "+ result);

    }
}
