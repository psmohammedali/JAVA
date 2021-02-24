package com.company.DSA.OOPS;

public class complexproblem
{
    int real;
    int imaginary;
    public complexproblem(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    public void print()
    {
        System.out.println(this.real + " + "+this.imaginary);
    }
    public void multiply(complexproblem c)
    {
        int newNum = (this.real*c.real) - (this.imaginary*c.imaginary);
        this.imaginary =(this.real*c.imaginary)+ (this.imaginary*c.real);
    }
}

class problems1
{
    public static void main(String[] args)
    {
        complexproblem c1 = new complexproblem(3,6);
        complexproblem c2 = new complexproblem(7,9);
        c1.print();
        c2.print();
        c1.multiply(c2);
        c1.print();

    }
}





