/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13.priority.queue.using.heap.sort;

/**
 *
 * @author Wajeeha Parker
 */
public class priorityqueue {
    private heaps theheap=new heaps(10);
    public void insert(int nd)
    { theheap.insert(nd); }
    public node remove()
    { return theheap.remove(); }
    public void display()
    {theheap.displayheap();}
}
