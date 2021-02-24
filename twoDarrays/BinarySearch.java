package com.company.twoDarrays;

import java.util.Scanner;

public class BinarySearch
{
    static Scanner scan = new Scanner(System.in);
    public static int binarySearch(int[] array, int x)
    {
        int start = 0;
        int end = array.length - 1;
        while(start !=end)
        {
           // System.out.println(start + " "+ end);
            int mid = (start + end)/2;
           // System.out.println(mid);
            if(array[mid]==x)
            {
                return mid;
            }
            if(array[mid]>x)
            {
                end = mid-1;
            }
            if(array[mid]<x)
            {
                start = mid+1;
            }
        }

        if(start == end)
        {
            if(array[start] == x)
                return start;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        System.out.println("WELCOME TO BINARY SEARCH");
        int[] array = {12,16,17,19,20,25,29};
        int search  = 16;
        int res = binarySearch(array,search);
        System.out.println(res);

    }
}
