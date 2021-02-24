package com.company.DSA.OOPS.inheritance;

public class Person
{
    protected String name;
    char gender;
    int age;
    String emailId;

    public Person(int maxspeed)
    {
        System.out.println("Person Class");
    }

    public void setEmailId(String email)
    {
        this.emailId = email;
    }

    public void print()
    {
        System.out.println(name+ " "+ gender+" "+age+" "+emailId);
    }
}

