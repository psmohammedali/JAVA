package com.company.basic;

public class leet132
{

    public static boolean find132pattern(int[] nums)
    {
        boolean is132 = false;
        for(int i=1;i<nums.length-1;i++)
        {
            if((nums[i-1]<nums[i]) && (nums[i]>nums[i+1]))
            {
                is132 = true;
                return is132;
            }
        }
        return is132;
    }

    public static void main(String[] args)
    {
        int[] str  = {1,0,1,-4,-3};
        boolean res = find132pattern(str);
        System.out.println(res);
    }
}

