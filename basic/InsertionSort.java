package com.company.basic;

public class InsertionSort
{
    public static void printArray(int[] array)
    {
        for(int i:array)
            System.out.print(i + " ");
    }
    public static void selectionSort(int[] arr)
    {
        //array[0] is already sorted
        int n = arr.length;
        for (int i = 1; i < n; ++i)
        {
            int key = arr[i];
            int j = i - 1;

            for (;j >= 0 && arr[j] > key;j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }
    public static void selectionSort1(int[] arr)
    {
        for(int i = 1;i<arr.length;i++)
        {
            int temp = arr[i];
            int j = i-1;
            for(;j>=0 && arr[j]>temp;j--)
            {
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }
    public static void insertionSort(int[] arr)
    {
        for(int i = 1;i<arr.length;i++)
        {
            int temp = arr[i];
            int j = i-1;
            for(;j>=0 && arr[j]>temp;j--)
            {
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }


    public static void main(String[] args)
        {
        int[] arr = {9,3,5,4,0,2};
        printArray(arr);
        System.out.println();
        selectionSort1(arr);
        printArray(arr);
        }
}
