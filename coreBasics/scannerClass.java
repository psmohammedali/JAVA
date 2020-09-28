package com.company;
import java.util.Scanner;
public class scannerClass {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);


        char gender = scan.next().charAt(0);
        int num = scan.nextInt();
        double dou = scan.nextDouble();
        scan.nextLine();
        String name = scan.nextLine();

        System.out.println(name);
        System.out.println(num);
        System.out.println(gender);
        System.out.println(dou);
    }
}
