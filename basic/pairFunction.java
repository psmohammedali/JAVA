package com.company.basic;

import java.util.Scanner;

public class pairFunction
{
    public static void pairPrint(int[] array)
    {
        for(int i = 0; i<array.length;i++)
        {
            int j = i+1;
            while(j<array.length)
            {
                System.out.print("("+array[i]+ "," +array[j]+")");
                System.out.print(" ");
                j++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int n = scan.nextInt();
        //intializing the array
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        pairPrint(arr);

    }
}
