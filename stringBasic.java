package com.company.string;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class stringBasic
{
    public static void main(String[] args)
    {
        String s = "Mohammedali";
        Scanner scan =  new Scanner(System.in);
        String str1 = scan.next();
        scan.nextLine();
        String str2 = scan.nextLine();

        System.out.println(str2);
        System.out.println(str1);


    }
}
