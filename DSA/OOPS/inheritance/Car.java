package com.company.DSA.OOPS.inheritance;

class Car {
    String name;
}
class truck extends Car
{
    public static void main(String[] args)
    {
        truck t = new truck();
        t.name="ali";
        System.out.println(t.name);

    }
}

