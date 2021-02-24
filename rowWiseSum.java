package com.company.string;

public class rowWiseSum
{
    public static void rowSum(int[][] mat)
    {

        for(int i = 0;i<mat.length;i++)
        {
            int sum = 0;
            for(int j = 0;j<mat[i].length;j++)
            {
                sum = sum + mat[i][j];
            }
            System.out.print(sum+ " ");
        }
    }

    public static void main(String[] args)
    {
    int[][] arr = {{1,3,4},{5,6,7},{5,9}};    // 8 18 14
    rowSum(arr);
    }
}
