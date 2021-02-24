package com.company.DSA.OOPS;

public class DyanamicUsage
{
    public static void main(String[] args)
    {
        DynamicArray d1= new DynamicArray();
        d1.add(10);
        d1.add(16);
        d1.add(110);
        d1.add(190);
        d1.add(1,51);
        System.out.println(d1.size());
        d1.printAll();
       // System.out.println(d1.printLast());
    }
}
