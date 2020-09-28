package com.company;

import org.w3c.dom.ls.LSOutput;

public class scope {
    int x =10;
    public static void main(String[] args) {
        scope s = new scope();
        System.out.println(s.x);
    }
}
