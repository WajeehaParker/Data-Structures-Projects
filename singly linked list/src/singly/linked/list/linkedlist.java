/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singly.linked.list;

/**
 *
 * @author Wajeeha Parker
 */
public class linkedlist {
    node first;
    public linkedlist()
    {
        first=null;
    }
    public boolean isempty()
    {
        return first==null;
    }
    public void insertfirst(int n)
    {
        node link=new node(n);
        link.setnext(this.first);
        this.first=link;
    }
    public node deletefirst()
    {
        node temp=this.first;
        this.first=this.first.getnext();
        return temp;
    }
    public node find(int key)
    {
        node current=this.first;
        while(current.getdata()!=key)
        {
            if (current.getnext()==null)
                return null;
            else 
                current=current.getnext();
        }
        return current;
    }
    public node delete(int key)
    {
        node current=this.first;
        node previous=this.first;
        while(current.getdata()!=key)
        {
            if (current.getnext()==null)
                return null;
            else 
            {
                previous=current;
                current=current.getnext();
            }
        }
        if (current==this.first)
            current=current.getnext();
        else
            previous.setnext(current.getnext());
        return current;
    }
    public void insertat(int a, int b)
    {
        node current=this.first;
        node previous=this.first;
        node temp=new node(a);
        for (int i=0; i<b-1; i++)
        {
            previous.setnext(current.getnext());
            current=current.getnext();
        }
        temp.setnext(previous.getnext());
        previous.setnext(temp);
    }
    public void insertafter(int a, int key)
    {
        node current=this.first;
        node previous=this.first;
        node temp=new node(a);
        while(previous.getdata()!=key)
        {
            if (previous.getnext()==null)
            {
                System.out.println("Number not present in the list.");
                break;
            }
            else
            {
                previous=current;
                current=current.getnext();
            }
        }
        if (previous.getnext()!=null)
        {
            temp.setnext(previous.getnext());
            previous.setnext(temp);
        }
    }
    public void append(int a)
    {
        node current=this.first;
        node temp=new node(a);
        while(current.getnext()!=null)
            current=current.getnext();
        current.setnext(temp);
    }
    public void displaylist()
    {
        if (isempty())
            System.out.println("list is empty");
        else
        {
            node current=this.first;
            while (current!=null)
            {
                current.displaynode();
                current=current.getnext();
            }
        }
    }
}
