package com.company.basic;

public class mergeSortedArray
{
    public static int[] mergeArray(int[] array1, int[] array2)
    {
        // create array 3
        int arr_size = array1.length + array2.length;

        //creating an array
        int[] array3 = new int[arr_size];
        int k = 0;
        int i = 0;
        int j = 0;
            while(i< array1.length && j<array2.length)
            {
                if (array1[i] > array2[j])
                {
                    array3[k] = array2[j];
                    j++;
                    k++;
                }
                else if (array1[i] < array2[j])
                {
                    array3[k] = array1[i];
                    i++;
                    k++;
                }
            }
        //System.out.println("i: " +i);
        //System.out.println("j: "+ j);
        if(j== array2.length)
        {
            for(;i<array1.length;i++)
            {
                array3[k] = array1[i];
                k++;
            }
        }
        else if(i == array1.length)
        {
            for(;j<array2.length;j++)
            {
                array3[k] = array1[j];
                k++;
            }
        }
        return array3;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {2,4,6,8,9,10,11};    // arr1.length = 6
        int[] arr2 = {1,3,5,7};         // arr2.length = 4
        int[] resArray = mergeArray(arr1, arr2);

        for(int i = 0 ; i<resArray.length;i++)
        {
            System.out.println(resArray[i]);
        }

    }
}
