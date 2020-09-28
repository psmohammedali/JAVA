package com.company;

public class maxNumber {

    public static int maximum(int[] num)
    {
        int maxsofar = num[0];
        for(int temp : num)
        {
            if (temp > maxsofar)
            {
                maxsofar = temp;
            }
        }
        return maxsofar;
    }
    public static void main(String[] args)
    {
    int[] marks = {52,15,24,62,52,152};
    int maximumInt = maximum(marks);
        System.out.println(maximumInt);
    }
}
