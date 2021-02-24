package com.company.string;
public class permutation
{
    public static boolean checkPermutations(String str1,String str2)
    {
        StringBuffer s1 = new StringBuffer(str1);
        StringBuffer s2 = new StringBuffer(str2);
        for(int i = 0;i<s1.length();i++)
        {
            for(int j = 0; j<s2.length();j++)
            {
                if(s1.charAt(i) == s2.charAt(j))
                {
                    s2.deleteCharAt(j);
                    break;
                }
            }
        }
        return s2.length() == 0;
    }



    public static void main(String[] args)
    {
        String str1 = "stmirg";
        String str2 = "srtimg";
        boolean isPermit = checkPermutations(str1,str2);
        System.out.println(isPermit);
    }
}
