/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkg3.separate.chaining;

/**
 *
 * @author Wajeeha Parker
 */
public class hashtable {
    sortedlist[] hasharray;
    int arraysize;
    public hashtable(int size)
    {
        this.arraysize=size;
        hasharray= new sortedlist[arraysize];
        for (int i=0; i<arraysize; i++)
            hasharray[i]=new sortedlist();
    }
    public void displaytable()
    {
        for (int i=0; i<arraysize; i++)
        {
            System.out.println(i+".");
            hasharray[i].displaylist();
        }
    }
    public int hashfunction(int key)
    {
        return key % arraysize;
    }
    public void insert(int key)
    {
        node n=new node(key);
        int hashval=hashfunction(key);
        hasharray[hashval].insert(n);
    }
    public void delete(int key)
    {
        int hashval=hashfunction(key);
        hasharray[hashval].delete(key);
    }
    public void find(int key)
    {
        int hashval=hashfunction(key);
        node n=hasharray[hashval].find(key);
        if (n!=null)
            System.out.println("Key found");
        else System.out.println("Key not found");
    }
}
