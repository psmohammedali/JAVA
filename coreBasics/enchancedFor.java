package com.company;
import java.util.Arrays;
public class enchancedFor {
    public static void main(String[] args) {
        int[] obj1 = {1,2,3,4,5,6,7,8,9};
        int[] obj2;
        obj2 = new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19};
        System.out.println(Arrays.toString(obj1));
        for(int i: obj2)
        {
            System.out.print(i + " " );
        }

    }
}
