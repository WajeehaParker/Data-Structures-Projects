/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubly.linked.list;

/**
 *
 * @author Wajeeha Parker
 */
public class node {
    private int data;
    private node next, previous;
    public node (int n)
    {
        this.data=n;
        this.next=null;
        this.previous=null;
    }
    public void setdata(int n)
    {
        this.data=n;
    }
    public int getdata()
    {
        return this.data;
    }
    public void setnext(node n)
    {
        this.next=n;
    }
    public node getnext()
    {
        return this.next;
    }
    public void setprevious(node p)
    {
        this.previous=p;
    }
    public node getprevious()
    {
        return this.previous;
    }
    public void displaynode()
    {
        System.out.println(" "+this.data);
    }
}
