package com.company.basic;

//Given an array arr[] and size of array is n and one another key x, and give you a segment size k.
//The task is to find that the key x present in every segment of size k in arr[].


import java.util.*;
public class findK
{
    static Scanner scan = new Scanner(System.in);
    public static int[] getArray(int size)
    {
        int[] arr = new int[size];
        for(int i =0; i<size; i++)
            arr[i] = scan.nextInt();
        return arr;
    }
    public static boolean segmentation(int[] arr, int difference, int key)
    {
        boolean res = false;
        for(int i = 0;i<arr.length;i=i+difference)
        {
            System.out.println(i + ","+res);
            for(int j = i; j<i+difference && j<arr.length;j++)
            {
                if(arr[j] == key)
                {
                    res = true;
                    break;
                }
                if(arr[j]!=key)
                {
                    res = false;
                }
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int arr_size = scan.nextInt();
        int[] arr = getArray(arr_size);
        System.out.println("Enter the segment value: ");
        int diff = scan.nextInt();
        System.out.println("Enter the key: ");
        int key = scan.nextInt();

        boolean res = segmentation(arr, diff, key);
        System.out.println(res);
    }


}
