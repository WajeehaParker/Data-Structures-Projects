/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.binary.tree;

/**
 *
 * @author Wajeeha Parker
 */
public class node {
    private int data;
    node rightchild, leftchild;
    node(int n)
    {
        this.data=n;
    }
    public void setdata(int data)
    {
        this.data=data;
    }
    public int getdata()
    {
        return this.data;
    }
    public void display()
    {
        System.out.println(" "+this.data);
    }
}
