package com.company.twoDarrays;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bufferReader
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader ir = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(ir);
        Scanner scan = new Scanner(System.in);

        char a = 'y'+'n';
        System.out.println(a);


    }
}
