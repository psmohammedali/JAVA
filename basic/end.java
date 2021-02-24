package com.company.basic;

import java.util.Arrays;

public class end
{
    public static void pushZerosAtEnd(int[] arr)
    {
        int[] temp = new int[arr.length];
        // for(int i:temp)
        //     System.out.println(i);
        int j = 0;
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                temp[j] = arr[i];
                j++;
            }
        }
        System.out.println(arr);
        System.out.println(temp);
        arr = temp;
        System.out.println(arr);
        System.out.println(temp);
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for(int i = 0; i<temp.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void printArray(int[] arr)
    {
        for(int i = 0; i<arr.length;i++)
            System.out.print(arr[i]+ " ");
    }
    public static void main(String[] args)
    {
        int[] array = {0,0,7,2};
        pushZerosAtEnd(Arrays.stream(array).toArray());
        printArray(array);


    }
}
