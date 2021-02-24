package com.company.string;

public class Most_occured_character
{
    public static char occurChar(String str)
    {
        char currentMaxChar = str.charAt(0);
        int largest = 1;
        for(int i = 0;i<str.length();i++)
        {
            int count = 1;
            for(int j = i+1;j<str.length();j++)
            {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if(count>largest)
            {
                currentMaxChar = str.charAt(i);
                largest = count;
            }
        }
        return currentMaxChar;
    }

    public static void main(String[] args)
    {
        String str = "abbbccccddd";
        char res = occurChar(str);
        System.out.println(res);
    }

}
