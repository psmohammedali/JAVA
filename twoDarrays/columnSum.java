package com.company.twoDarrays;

public class columnSum
{
    public static void main(String[] args)
    {
       int[][] arr = {{1},{1,2,3},{1,2,3,4,5},{1,2},{1,2,3},{1,2,3,4,18,15}};
       int j = 0;
       int largest = Integer.MIN_VALUE;
        int count = 1;
       while(count>0)
       {
           count = 0;
           int sum = 0;

           for(int i = 0;i<arr.length;i++)
           {
               if(j<arr[i].length)
               {
                  sum = sum + arr[i][j];
                  count++;
               }
           }
           if(sum>largest)
               largest = sum;
           j++;
       }
        System.out.println(largest);
    }
}
