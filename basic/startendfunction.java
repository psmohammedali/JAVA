package com.company.basic;
import java.util.Scanner;

public class startendfunction
{
    public static void pri(int start, int end){
        if(start%2 == 0)
        {
            for(int i = start; i<=end; i=i+2)
                System.out.print(i+ " ");
        }
        else
        {
            start = start + 1 ;
            for(int i = start; i<=end; i=i+2)
                System.out.print(i+ " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int e = scan.nextInt();
        pri(s,e);

    }
}
