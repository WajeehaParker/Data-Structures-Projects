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
public class sortedlist {
    private node first;
    public sortedlist()
    {
        this.first=null;
    }
    public void insert(node key)
    {
        node previous=null;
        node current=this.first;
        while(current!=null && current.getdata()>key.getdata())
        {
            previous=current;
            current=current.getnext();
        }
        if (previous==null)
            this.first=key;
        else
            previous.setnext(key);
        key.setnext(current);
    }
    public void delete(int n)
    {
        node key=new node(n);
        node previous=null;
        node current=this.first;
        while(current!=null && current.getdata()>n)
        {
            previous=current;
            current=current.getnext();
        }
        if (previous==null)
            this.first=this.first.getnext();
        else
            previous.setnext(current.getnext());
    }
    public node find(int key)
    {
        /*node current=this.first;
        while(current.getdata()!=key)
        {
            if (current.getnext()==null)
                return null;
            else 
                current=current.getnext();
        }
        return current;*/
        node n=new node (key);
        node current=this.first;
        while(current!=null && current.getdata()<=key)
        {
            if (current.getdata()==key)
                return current;
            current=current.getnext();
        }
        return null;
    }
    public void displaylist()
    {
        node current = first;
        while(current != null)
        {
            current.displaynode();
            current = current.getnext();
        }
        System.out.println("");
    }
}
