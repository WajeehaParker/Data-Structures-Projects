/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author Wajeeha Parker
 */
public class stack {
    private int top;
    int[] array;
    stack(int max)
    {
        this.top=-1;
        this.array=new int[max];
    }
    public void push(int ch)
    {
        array[++top]=ch;
    }
    public int pop()
    {
            return array[top--];
    }
    public int peek()
    {
        return array[top];
    }
    public boolean isempty()
    {
        return top==-1;
    }
}
