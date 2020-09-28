package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class scannerClass2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Integer");
        int s = scan.nextInt();
        System.out.println("Enter the name");
        String str = scan.nextLine();

        System.out.println("The entered values are "+ s + "and" + str);
    }
}
