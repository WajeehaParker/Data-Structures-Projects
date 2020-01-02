/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.sorting;

/**
 *
 * @author Wajeeha Parker
 */
public class mergesort {
    private int[] array;
    private int element, max;
    public mergesort(int max)
    {
        this.max=max;
        this.array=new int[max];
        this.element=0;
    }
    public void setarray(int[] arr)
    {
        this.array=arr;
    }
    public int[] getarray()
    {
        return this.array;
    }
    public void insert(int value)
    {
        if (this.element==this.max)
            System.out.println("Array full");
        else{
            array[this.element]=value;
            this.element++;
        }
        
    }
    public void display()
    {
        for (int i=0; i<this.element; i++)
            System.out.println(array[i]+ " ");
        System.out.println();
    }
    public void msort()
    {
        int[] temp= new int [this.element];
        mergesort(temp, 0, element-1);
    }
    public void mergesort(int[] arr, int l, int r)
    {
        if (l==r)
            return;
        else
        {
            int m=(l+r)/2;
            mergesort(arr, l, m);
            mergesort(arr, m+1, r);
            merge(arr, l, m+1, r);
        }
    }
    private void merge(int[] temp, int low, int high, int right)
    {
    int j = 0; // workspace index
    int left = low;
    int mid = high-1;
    int n = right-left+1; // # of items
    while(low <= mid && high <= right)
    if(array[low] < array[high] )
    temp[j++] = array[low++];
    else
    temp[j++] = array[high++];
    while(low <= mid)
    temp[j++] = array[low++];
    while(high <= right)
    temp[j++] = array[high++];
    for(j=0; j<n; j++)
    array[left+j] = temp[j];
    } // end merge()
    
}