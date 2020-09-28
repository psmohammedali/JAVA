package com.company;

public class formattedOutput {
    public static void main(String[] args) {
        int i = 20;
        double j = 12.3536542421;
        System.out.println(i);
        //System.out.println(j);
        System.out.printf("%d\n",i);
        System.out.printf("%.4f",j);
    }
}
