package com.company.basic;

public class doubt
{
    public static void main(String[] args)
    {
        for(int i = 0; i<5; i++)
        {
            for(int j = i; j<5;j++)
            {
                if(j == 3)
                    {
                        break;
                    }
                System.out.println(i + ","+ j);
            }
            System.out.println(i);
        }
        System.out.println("This is outside for loop");
    }
}
