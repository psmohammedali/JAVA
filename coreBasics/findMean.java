package com.company;
import java.util.Scanner;
public class findMean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0; int count=0;

        while(scan.hasNextInt()) {
            int temp = scan.nextInt();
            sum = sum+temp;
            ++count;
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
