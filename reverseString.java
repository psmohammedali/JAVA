package com.company.string;

import java.util.Scanner;

public class reverseString
{
    public static String reverseFunction(String str)
    {
        String revese = "";
        for(int i = str.length()-1;i>=0;i--)
        {
            revese = revese + str.charAt(i);
        }
        return revese;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String result = reverseFunction(input);
        System.out.println(result);
    }
}
