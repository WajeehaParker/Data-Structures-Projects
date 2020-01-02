/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.stack;

/**
 *
 * @author Wajeeha Parker
 */
public class stackx {
    linkedlist stacklist;
    public stackx()
    {
        stacklist=new linkedlist();
    }
    public void puch (int ch)
    {
        stacklist.insertfirst(ch);
    }
    public int pop()
    {
        if (stacklist.isempty())
            return 0;
        else
        return stacklist.deletefirst().getdata();
    }
    public int peek()
    {
        if (stacklist.isempty())
            return 0;
        else
        return stacklist.getfirst().getdata();
    }
}
