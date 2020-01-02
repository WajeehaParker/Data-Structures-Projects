/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sting.reverser;

/**
 *
 * @author Wajeeha Parker
 */
public class stack {
    private int top;
    char[] array;
    stack(int max)
    {
        this.top=-1;
        this.array=new char[max];
    }
    public void push(char ch)
    {
        array[++top]=ch;
    }
    public char pop()
    {
        return array[top--];
    }
    public char peek()
    {
        return array[top];
    }
    public boolean isempty()
    {
        return top==-1;
    }
}
