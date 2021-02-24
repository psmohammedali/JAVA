package com.company.inherit;

import com.company.DSA.OOPS.inheritance.Person;

public class temp3 extends Person
{
    int mybednum;
    public temp3()
    {
        super(100);
        System.out.println("IN temp3");

    }
    public void print()
    {
        System.out.println(name+2);
    }


    public static void main(String[] args)
    {
        temp3 tt = new temp3();
//        //System.out.println(tt.mybednum);
//        tt.name = "ali";
//        tt.print();
    }

}

