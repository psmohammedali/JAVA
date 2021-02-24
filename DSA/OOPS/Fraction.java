package com.company.DSA.OOPS;

public class Fraction
{
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    private void simplify()
    {
        int minNum = Math.min(numerator,denominator);
        int gcd = 1;
        for(int i = 2; i <=minNum;i++)
        {
            if(numerator%i == 0 && denominator%i==0)
            {
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    };
    void print()
    {
        System.out.println(this.numerator+"/"+this.denominator);
    }
    void incrementby1()
    {
        this.numerator = this.numerator+this.denominator;
        simplify();
    }
    void addN(int number)
    {
        numerator = this.numerator+(this.denominator*number);
        simplify();
    }
    void add(Fraction f)
    {
        this.numerator = (this.numerator*f.denominator)+ (this.denominator*f.numerator);
        this.denominator = this.denominator*f.denominator;
        simplify();
    }



}
