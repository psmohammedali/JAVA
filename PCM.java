package com.company.string;
import java.util.*;
public class PCM {
    public static void findPCM(String str)
    {
        int total = 'P' + 'C' + 'M';

        int currentSum = 0;
        for (int i = 0; i < str.length(); i++)
        {
            currentSum = currentSum + str.charAt(i);
        }

        if (total == currentSum) {
            System.out.println(total);
            System.out.println(currentSum);
            System.out.println("YES");
        }
        else
            {
            System.out.println(total);
            System.out.println(currentSum);
            System.out.println("NO");
            }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String to = scan.nextLine();
        for(;t>0;t--)
        {
            String s = scan.nextLine();
            findPCM(s);

        }
    }
}
