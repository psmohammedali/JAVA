package com.company.string;

import java.nio.charset.StandardCharsets;

public class StringClass
{
    public static void main(String[] args)
    {
    String s = new String("abc");
    String s1= "abc";
        String s2 = new String("abc");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s==s2);

    }
}
