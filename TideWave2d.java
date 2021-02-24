package com.company.string;

public class TideWave2d
{
    public static void tidewave(int[][] mat)
    {
        if(mat.length==0)
            return;
        int j = 0;
        int count = 1;
        while(count>0)
        {
            count = 0;
            if(j%2==0)
            {
                for (int i = 0; i < mat.length; i++)
                {
                    if (j < mat[i].length)
                    {
                        System.out.print(mat[i][j] + " ");
                        count++;
                    }
                }
            }
            else
                {
                    for(int i = mat.length-1;i>=0;i-- )
                    {
                        if(j<mat[i].length)
                        {
                            System.out.print(mat[i][j]+ " ");
                            count++;
                        }
                    }
                }
            j++;
        }
    }
    public static void main(String[] args)
    {
        int[][] arr = {{1,23,5},{4,5,9},{1,26,7,9,4},{1, 8}};
        tidewave(arr);
    }
}
