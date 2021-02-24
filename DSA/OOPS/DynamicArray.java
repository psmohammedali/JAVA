package com.company.DSA.OOPS;

class DynamicArray
{
    int[] arr;
    private int nextElement;
    public DynamicArray()
    {
        arr = new int[10];
    }
    public int size()
    {
        return nextElement;
    }
    public void add(int num)
    {
        if(nextElement==arr.length)
        {
            int[] temp = arr;
            arr = new int[2*arr.length];
            for(int i = 0;i<nextElement;i++)
            {
                arr[i] = temp[i];
            }
        }
        arr[nextElement] = num;
        nextElement++;
    }

    public void add(int index, int element)
    {
        if(index>=nextElement)
            return;
        if(nextElement==arr.length)
        {
            {
                int[] temp = arr;
                arr = new int[2*arr.length];
                for(int i = 0;i<nextElement;i++)
                {
                    arr[i] = temp[i];
                }
            }
        }
        for(int i = nextElement-1;i>=index;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[index] = element;
        nextElement++;
    }
    public void insert(int index, int number)
    {
        if(index>=nextElement) {
            return;
        }
        arr[index-1] = number;
    }
    public int printLast()
    {
        return arr[nextElement - 1];
    }
    public int get(int index)
    {
        if(index>=nextElement)
            return -1;
        return arr[index];
    }
    public boolean isEmpty()
    {
        return nextElement == 0;
    }
    public void printAll()
    {
        for(int i = 0; i<nextElement;i++){
            System.out.print(this.arr[i]+ " ");
        }
    }



}
