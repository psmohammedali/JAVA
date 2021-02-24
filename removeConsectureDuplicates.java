package com.company.string;

public class removeConsectureDuplicates
{
    public static String removeConsecutive(String str)
    {
        String final_String = "";
        char current_char = str.charAt(0);
        final_String = final_String+current_char;
        for(int i = 1;i<str.length();)
        {
            if(current_char == str.charAt(i))
            {
                i++;
            }
            else
            {
                final_String = final_String + str.charAt(i);
                current_char = str.charAt(i);
                i++;
            }
        }
        return final_String;
    }
    public static void main(String[] args)
    {
        String str = "aabbcdccc";
        String res = removeConsecutive(str);
        System.out.println(res);   //abc
    }
}
