/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing.open.addressing.quadratic.probing;

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
            if (this.hasharray[i]!=null && this.hasharray[i].getdata()!=-1)
                System.out.println(hasharray[i].getdata()+",");
            else System.out.println("**,");
        }
    }
    public int hashfunction(int key)
    {
        return key%arraysize;
    }
    public void insert(int d)
    {
        int i=1;
        dataitem data=new dataitem(d);
        if(count!=arraysize)
        {
            int hashval=hashfunction(d);
            while(hasharray[hashval]!=null && hasharray[hashval].getdata()!=-1)
            {
                hashval+=i*i;
                hashval%=arraysize;
                i++;
            }
            hasharray[hashval]=data;
            count++;
        }
        else System.out.println("List full");
    }
    public void delete(int data)
    {
        dataitem[] temparray=new dataitem[this.arraysize];
        for (int i=0; i<this.arraysize; i++)
            temparray[i]=hasharray[i];
        int counter=arraysize;
        int hashval=hashfunction(data);
        int i=1;
        boolean found=false;
        int a=0;
        while(counter!=0)
        {
            if (temparray[hashval]!=null)
            {
                if (temparray[hashval].getdata()==data)
                {
                    hasharray[hashval]=nonitem;
                    System.out.println("Item deleted");
                    found=true;
                    a--;
                    break;
                }
                if (temparray[hashval].getdata()!=0)
                {
                    temparray[hashval].setdata(0);
                    counter--;
                    a--;
                }
                a++;
            }
            else
            {
                dataitem d= new dataitem(0);
                temparray[hashval]=d;
                counter--;
                a--;
            }
            if (a%3==0)
                hashval++;
            hashval+=i*i;
            hashval%=arraysize;
            i++;
        }
        if (counter==0)
            System.out.println("Item not found");
    }
    public void find (int data)
    {
        /*dataitem temp;
        int i=0;
        count=arraysize;
        int hashval=hashfunction(data);
        while(hasharray[hashval]!=null && count!=0)
        {
            if (hasharray[hashval].getdata()==data)
            {
                count--;
                System.out.println("Found");
                return hasharray[hashval];
            }
            i++;
            hashval+=i*i;
            hashval%=arraysize;
            count--;
        }
        if (count==0)
            System.out.println("Not found");
        return this.nonitem;*/
        dataitem[] temparray=new dataitem[this.arraysize];
        for (int i=0; i<this.arraysize; i++)
            temparray[i]=hasharray[i];
        int counter=arraysize;
        int hashval=hashfunction(data);
        int i=1;
        boolean found=false;
        int a=0;
        while(counter!=0)
        {
            if (temparray[hashval]!=null)
            {
                if (temparray[hashval].getdata()==data)
                {
                    System.out.println("Item found");
                    found=true;
                    a--;
                    break;
                }
                if (temparray[hashval].getdata()!=0)
                {
                    temparray[hashval].setdata(0);
                    counter--;
                    a--;
                }
                a++;
            }
            else
            {
                dataitem d= new dataitem(0);
                temparray[hashval]=d;
                counter--;
                a--;
            }
            if (a%3==0)
                hashval++;
            hashval+=i*i;
            hashval%=arraysize;
            i++;
        }
        if (counter==0)
            System.out.println("Item not found");
    }
}
