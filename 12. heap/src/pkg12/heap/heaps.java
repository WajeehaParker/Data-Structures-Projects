/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.heap;

/**
 *
 * @author Wajeeha Parker
 */
public class heaps {
    private node[] heaparray;
    private int maxsize, currentsize;
    public heaps(int max)
    {
        this.maxsize=max;
        this.heaparray=new node[maxsize];
        this.currentsize=0;
    }
    public boolean isempty()
    {
        return currentsize==0;
    }
    public boolean insert(int key)
    {
        if (currentsize==maxsize)
            return false;
        node temp=new node(key);
        heaparray[currentsize]=temp;
        trickleup(currentsize++);
        return true;
    }
    public void trickleup(int index)
    {
        int parent=(index-1)/2;
        node bottom=heaparray[index];
        while(index>0 && heaparray[parent].getkey()<bottom.getkey())
        {
            heaparray[index]=heaparray[parent];
            index=parent;
            parent=(parent-1)/2;
        }
        heaparray[index]=bottom;
    }
    public node remove()
    {
        node root=heaparray[0];
        heaparray[0]=heaparray[--currentsize];
        trickledown(0);
        return root;
    }
    public void trickledown(int index)
    {
        int largechild;
        node top=heaparray[index];
        while(index<currentsize/2)    //till root has atleast 1 child
        {
            int leftchild=2*index+1;
            int rightchild=leftchild+1;
            if (rightchild<currentsize /*right child exists*/ && heaparray[leftchild].getkey()<heaparray[rightchild].getkey())
                largechild=rightchild;
            else largechild=leftchild;
            if (top.getkey()>=heaparray[largechild].getkey())
                break;
            heaparray[index]=heaparray[largechild];
            index=largechild;
        }
        heaparray[index]=top;
    }
    public boolean change(int index, int newvalue)
    {
        if (index<0 || index>currentsize)
            return false;
        int oldvalue=heaparray[index].getkey();
        heaparray[index].setkey(newvalue);
        if (oldvalue<newvalue)
            trickleup(index);
        else trickledown(index);
        return true;
    }
    public void displayheap()
    {
        System.out.println("Heap array:");
        for (int i=0; i<currentsize; i++)
            if (heaparray[i]!=null)
                System.out.println(heaparray[i].getkey()+ " ");
            else System.out.println("--");
        System.out.println();
        
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0; // current item
        String dots = "...............................";
        System.out.println(dots+dots); // dotted top line
        while(currentsize > 0) // for each heap item    
        {
            if(column == 0) // first item in row?
            for(int k=0; k<nBlanks; k++) // preceding blanks
                System.out.print(" ");
                // display item
            System.out.print(heaparray[j].getkey());
            if(++j == currentsize) // done?
                break;
            if(++column==itemsPerRow) // end of row?
            {
                nBlanks /= 2; // half the blanks
                itemsPerRow *= 2; // twice the items
                column = 0; // start over on
                System.out.println(); // new row
            }
            else // next item on row
                for(int k=0; k<nBlanks*2-2; k++)
            System.out.print(" "); // interim blanks
        } // end for
        System.out.println("\n"+dots+dots); // dotted bottom line
    }
}
