/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing.open.addressing.linear.probing;

/**
 *
 * @author Wajeeha Parker
 */
public class hashtable {
    private dataitem[] hasharray;
    private int arraysize, count;
    private dataitem nonitem;
    public hashtable(int size)
    {
        this.arraysize=size;
        this.hasharray=new dataitem[arraysize];
        this.nonitem=new dataitem(-1);
        this.count=0;
    }
    public void displaytable()
    {
        System.out.println("Table");
        for (int i=0; i<arraysize; i++)
        {
            if (this.hasharray[i]!=null && this.hasharray[i].getkey()!=-1)
                System.out.println(hasharray[i].getkey()+",");
            else System.out.println("**,");
        }
    }
    public int hashfunction(int key)
    {
        return key%arraysize;
    }
    public void insert(int d)
    {
        dataitem data=new dataitem(d);
        int hashval=hashfunction(d);
        if(count!=arraysize)
        {
            while(hasharray[hashval]!=null && hasharray[hashval].getkey()!=-1)
            {
                ++hashval;
                hashval%=arraysize;
            }
            hasharray[hashval]=data;
            count++;
            
        }
        else System.out.println("List full");
    }
    public dataitem delete(int data)
    {
        dataitem temp;
        int hashval=hashfunction(data);
        int a=hashval;
        while(hasharray[hashval]!=null)
        {
            if (hasharray[hashval].getkey()==data)
            {
                temp=hasharray[hashval];
                hasharray[hashval]=nonitem;
                this.count--;
                return temp;
            }
            hashval++;
            hashval%=arraysize;
            if (a==hashval)
            {
                System.out.println("Item not found");
                break;
            }
        }
        return null;
    }
    public dataitem find (int data)
    {
        int hashval=hashfunction(data);
        int a=hashval;
        while(hasharray[hashval]!=null)
        {
            if (hasharray[hashval].getkey()==data)
                return hasharray[hashval];
            hashval++;
            hashval%=arraysize;
            if (a==hashval)
            {
                System.out.println("Item not found");
                break;
            }
        }
        return null;
    }
}
