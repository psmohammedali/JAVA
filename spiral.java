package com.company.string;

public class spiral
{
    public static void stringPrint(int[][] mat)
    {
        int rowStart = 0;
        int rowEnd = mat.length-1;
        int colStart = 0;
        int colEnd = mat[0].length-1;

        while(rowStart<=rowEnd && colStart<=colEnd)
        {
            for(int j = colStart;j<=colEnd;j++)
            {
                System.out.print(mat[rowStart][j]+ " ");
            }
            rowStart++;

            for(int i = rowStart;i<=rowEnd;i++)
            {
                System.out.print(mat[i][colEnd]+ " ");
            }
            colEnd--;
            for(int j = colEnd;j>=colStart;j--)
            {
                System.out.print(mat[rowEnd][j]+ " ");
            }
            rowEnd--;
            for(int i = rowEnd;i>=rowStart;i--)
            {
                System.out.print(mat[i][colStart]+" ");
            }
            colStart++;
        }
    }

    public static void main(String[] args)
    {
        int[][] mat = {{1,23},{14,45},{13,76},{12,3},{15,36}};
        stringPrint(mat);
    }
}
