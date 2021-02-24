package com.company.basic;

import java.util.Scanner;

public class vowelsCountFunction
{
    public static int vowelsCount(String user)
    {
        int count = 0;
        int len = user.length();
        user = user.toLowerCase();
        for(int i = 0; i< user.length();i++)
        {
            if(user.charAt(i) == 'a' ||user.charAt(i) == 'e'||user.charAt(i) == 'i'||user.charAt(i) == 'o'||user.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String user = scan.next();
        int result = vowelsCount(user);
        System.out.println(result);

    }
}
