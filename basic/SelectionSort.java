package com.company.basic;

import java.util.Scanner;

public class SelectionSort
{
    static Scanner scan = new Scanner(System.in);

    // ----------------INPUT ARRAY --------------
    public static int[] createArray(int ArraySize)
    {
        int[] array = new int[ArraySize];
        for(int i = 0;i<array.length;i++)
            array[i] = scan.nextInt();
        return array;
    }
    // -----------------SELECTION SORT FUNCTION -------------
    public static void selectionSort(int[] array)
    {
        for(int i =0;i<array.length;i++)
        {
            for(int j = i+1;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int temp = 0;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }


        }
    }

    // -----------------DRIVER CODE -------------------
    public static void main(String[] args)
    {
        System.out.println("-------------Selection Sort----------------");

        System.out.println("Enter the array size");
        int size = scan.nextInt();
        int[] arr = createArray(size);
        selectionSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
