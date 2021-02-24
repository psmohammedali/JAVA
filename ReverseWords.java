package com.company.string;

import java.util.StringTokenizer;

public class ReverseWords
{
    public static void reverseWord(String input)
    {
        String final_word ="";
        StringTokenizer str = new StringTokenizer(input);
        while(str.hasMoreTokens())
        {
            String reverse = "";
            String current_word = str.nextToken();
            for(int i = 0;i<current_word.length();i++)
            {
                reverse = current_word.charAt(i) + reverse;
            }
            final_word = final_word + reverse + " ";
        }
        System.out.println(final_word.trim());
    }
    public static void main(String[] args)
    {
        String s = "my name is mohammed ali";  //output should be - ym eman si demmahom ila
        reverseWord(s);

    }
}
