package com.company.twoDarrays;

import java.util.Scanner;

public class arrayPrint
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        //printing
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
