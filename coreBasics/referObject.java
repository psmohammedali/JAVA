package com.company;

class vit {
    int a;
    int b;

    vit(int x, int y)
    {
        a = x;
        b = y;
    }
    boolean equalsObject(vit v){
        return (v.a == a && v.b == b);
    }
}
public class referObject {
    public static void main(String[] args) {
        vit obj1 = new vit(100,56);
        vit obj2 = new vit(100,56);
        vit obj3 = new vit(101,56);

        System.out.println(obj1.a);
        System.out.println(obj1.equalsObject(obj3));
    }
}
