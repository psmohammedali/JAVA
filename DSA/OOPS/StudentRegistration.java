package com.company.DSA.OOPS;

public class StudentRegistration
{
    private String name;
    int id;
    static final String schoolName = "VIT";
    private static int studentCount;

    public StudentRegistration(String name)
    {
        this.name = name;
        studentCount++;
    }
    public String getName()
    {
        return name;
    }
    public static int getCount()
    {
        int i = 2;
        System.out.println("4");
        //System.out.println(id);
        return studentCount;
    }


}
