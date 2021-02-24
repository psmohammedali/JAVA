package com.company.string;

public class removeChar
{
    public static String removeCharFunc(String str, char ch)
    {
        String final_String = "";
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i) != ch)
                final_String = final_String+str.charAt(i);
        }
        return final_String;
    }
    public static void main(String[] args)
    {
        String str = "aabbcccc";
        char ch = 'a';         //aacccc
        String res = removeCharFunc(str,ch);
        System.out.println(res);
    }
}
