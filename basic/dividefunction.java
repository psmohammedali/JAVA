package com.company.basic;

import java.util.Scanner;


public class dividefunction
{
    public static int divider(int num,int den)
    {
        return num/den;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();
        int den = scan.nextInt();
        int result = divider(num,den);
        System.out.println(result);


    }
}
