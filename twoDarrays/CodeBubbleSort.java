package com.company.twoDarrays;

import java.util.Scanner;

public class CodeBubbleSort
{
    static Scanner scan = new Scanner(System.in);



    // --------- GET VALUES FUNCTION -------------
    public static int[] getArray()
    {
        System.out.println("Enter the Array Size");
        int size = scan.nextInt();
        int[] arr = new int[size];

        //Getting the values for index of the array
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println("Enter the "+i+" index value: ");
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    // ------ Printing an Array Function -----------
    public static void printArray(int[] arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }


    // ---------- BUBBLE SORT FUNCTION ------------
    public static void bubbleSort(int[] arr)
    {
        int count = 0;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<arr.length-1-i;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        count++;
                    }
                }

        }
        System.out.println(count);


    }

    //---------- DRIVER CODE --------------
    public static void main(String[] args)
    {
        int[] a = getArray();
        printArray(a);
        bubbleSort(a);
        printArray(a);
    }
}
