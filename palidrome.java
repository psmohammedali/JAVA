package com.company.string;

import java.util.Scanner;

public class palidrome
{
    public static boolean isPalidrome(String str)
    {
        int l = str.length()-1;
        boolean isPali = true;

            for(int i = 0; i<=str.length()/2;i++)
            {
                if (str.charAt(i) != str.charAt(l - i)) {
                    isPali = false;
                    return false;
                }
            }
        return isPali;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        boolean res = isPalidrome(input);
        System.out.println(res);

    }
}
