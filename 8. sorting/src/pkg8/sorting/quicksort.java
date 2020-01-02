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
public class quicksort {
    private int[] array;
    private int element, max;
    public quicksort(int max)
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
            array[this.element++]=value;
            
        }
    }
    public void display()
    {
        for (int i=0; i<this.element; i++)
            System.out.println(array[i]+ " ");
        System.out.println();
    }
    public void qsort()
    {
        quicksort(0, element-1);
    }
    public void quicksort(int l, int h)
    {
        if (l<h)
        {
            int pivot = array[h];
            int p=partition(l, h, pivot);
            quicksort(l, p-1);
            quicksort(p+1, h);
        }
    }
    public int partition(int l, int r, long p)
    {
        int left = l-1; // left (after ++)
        int right = r; // right-1 (after --)
        while(true)
        { // find bigger item
            while( array[++left] < p );
            // (nop)
            // find smaller item
            while(right > 0 && array[--right] > p);
            // (nop)
            if(left >= right) // if pointers cross,
                break; // partition done
            else // not crossed, so
            {
                int k=array[left];
                array[left]=array[right];
                array[right]=k;
            }
        } // end while(true)
        int k=array[left];
        array[left]=array[r];
        array[r]=k;
        return left; // return pivot location
    } // end partitionIt()
    
}
