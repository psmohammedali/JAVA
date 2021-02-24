package com.company.basic;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Dollar
{
    public static float transaction(int amount,float initial)
    {
        float remaining = initial;
        if(amount%5 == 0)
        {
            remaining = (float)(initial - amount - 0.5);
            return remaining;
        }
        return remaining;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        float initial = scan.nextFloat();
        System.out.println(transaction(amount,initial));

    }
}