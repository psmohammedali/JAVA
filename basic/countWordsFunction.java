package com.company.basic;

import java.util.Scanner;

public class countWordsFunction
{

    //function
    public static int countWords(String user)
    {
        int count = 0;
        int len = user.length();
        for(int i = 0; i<len;i++)
        {
            if(user.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        int result = countWords(user);
        System.out.println(result+1);
    }
}
