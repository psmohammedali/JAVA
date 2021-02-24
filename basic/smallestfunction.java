package com.company.basic;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class smallestfunction
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();
        System.out.println(Math.max(Math.max(first,second),third));
        System.out.println(Math.min(Math.min(first,second),third));

    }

}
