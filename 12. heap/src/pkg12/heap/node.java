/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.heap;

/**
 *
 * @author Wajeeha Parker
 */
public class node {
    private int id;
    public node(int key)
    {
        this.id=key;
    }
    public void setkey(int key)
    {
        this.id=key;
    }
    public int getkey()
    {
        return this.id;
    }
}
