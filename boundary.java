package com.company.string;

public class boundary
{
    public static int findBoundary(int[][] mat)
    {
        int sum = 0;
        int rows = mat.length;
        int col = mat[0].length;
        int[] enteredArray = new int[rows*col];
        int temp = 0;
        for(int i = 0;i<rows;i++)
        {
            for(int j =0;j<col;j++)
            {
                if(i==0 || j == 0 || i == rows-1 || j == col-1 || i == j || j == col-1-i)
                {
                    boolean isAbsent = true;
                    for(int k = 0;k<enteredArray.length;k++)
                    {
                        if(enteredArray[k]== mat[i][j])
                        {
                            isAbsent = false;
                        }

                    }
                    if(isAbsent)
                    {
                        sum= sum+mat[i][j];
                        enteredArray[temp] = mat[i][j];
                        temp++;
                    }
                }
            }
        }
        for(int i = 0;i< enteredArray.length;i++)
            System.out.print(enteredArray[i]+ " ");
        return sum;

    }

    public static void main(String[] args)
    {
        //given n*n
        int[][] mat ={{6,9,8,5,9},{2,4,1,8,3},{9,3,8,7,8,},{6,8,9,4,1},{1,7,6,1,5}};
        int res = findBoundary(mat);
        System.out.println(res);
    }
}
