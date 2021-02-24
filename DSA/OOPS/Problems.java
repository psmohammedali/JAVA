package com.company.DSA.OOPS;

import java.util.Scanner;

public class Problems
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Fraction World!...");

        System.out.print("Enter the Numerator: ");
        int numerator = scan.nextInt();

        System.out.print("Enter the Denominator: ");
        int denominator = scan.nextInt();

        Fraction f1 = new Fraction(numerator,denominator);
        f1.print();
//        f1.incrementby1();
//        f1.print();
//        f1.addN(4);
//        f1.print();
        Fraction f2 = new Fraction(7,8);
        f1.add(f2);
        System.out.println(f1.numerator+"/"+ f1.denominator);
    }

}
