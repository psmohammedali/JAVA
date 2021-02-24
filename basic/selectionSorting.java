package com.company.basic;

import java.util.Scanner;

public class selectionSorting
{
    static Scanner scan = new Scanner(System.in);
    public static void printArray(int[] array)
    {
        for (int j : array)
        {
            System.out.print(j+ " ");
        }
        System.out.println("");
    }
    public static void selection(int[] array)
    {
        for(int i = 0;i<array.length-1;i++)
        {
            int min = i;
            //finding the minimum number index
            for(int j = i+1;j<array.length;j++)
            {
                if(array[min]>array[j])
                    min = j;
            }
            // from the minimum number index, we are swapping with i posting
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {7,8,5,4,3,9};
        //printing array before sorting
        printArray(arr);
        selection(arr);
        printArray(arr);



    }
}
