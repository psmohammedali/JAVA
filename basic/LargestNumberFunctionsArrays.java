package com.company.basic;

import java.util.Scanner;

public class LargestNumberFunctionsArrays
{
    public static int[] getdetails()
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size;i++)
        {
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public static int largest(int[] arr1)
    {
        int result = 0;
        for(int i =0; i< arr1.length;i++)
        {
            if(result < arr1[i])
                result = arr1[i];
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] arr3= getdetails();
        int lar = largest(arr3);
        System.out.println(lar);

    }
}
