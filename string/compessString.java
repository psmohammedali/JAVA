package com.company.string;

public class compessString
{
    public static String compress(String str)
    {
        String final_String = "";
        for(int i = 0;i<str.length();)
        {
            final_String = final_String + str.charAt(i);
            int count = 1;
            for(int j = i+1;j<str.length();j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    count++;
                }
                else
                    break;
            }
            if(count>1)
            final_String = final_String + count;
            i = i+count;
        }
        return final_String;
    }
    public static void main(String[] args)
    {
        String str = "XXXXXXXXXXXXXXXXXXXXXX";
        String res = compress(str);
        System.out.println(res);
    }
}
