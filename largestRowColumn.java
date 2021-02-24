package com.company.string;

public class largestRowColumn
{
    public static void largestRC(int[][] mat)
    {
        int rowLargest = 0;
        int rowNum = 0;
        int colNum = 0;
        int colLargest = 0;

        // iterating row wise and finding the largest row wise sum wrt its row
        for(int i = 0; i<mat.length;i++)
        {
            int sum = 0;
            for(int j = 0;j<mat[i].length;j++)
            {
                sum = mat[i][j] + sum;
            }
            if(rowLargest < sum)
            {
                rowLargest = sum;
                rowNum = i;
            }
        }

        //iterating column wise and finding the lagest column sum wrt to its col

        int j = 0;
        int readCount = 1;
        while(readCount>0)
        {
            readCount = 0;
            int sum = 0;
            for(int i = 0;i< mat.length;i++)
            {
                if(j<mat[i].length)
                {
                    sum = sum+mat[i][j];
                    readCount++;
                }
            }
            if(colLargest<sum)
            {
                colLargest = sum;
                colNum = j;
            }
            j++;
        }
        if(rowLargest>=colLargest)
            System.out.println("row "+ rowNum+" "+rowLargest);

        else
            System.out.println("column "+ colNum+" "+colLargest);
    }
    public static void main(String[] args)
    {
        int[][] arr = {{1},{2,3,4},{5,6,7,8,9},{10,1},{2,3,4},{6,6},{10,8,9}};
        largestRC(arr);
    }
}
