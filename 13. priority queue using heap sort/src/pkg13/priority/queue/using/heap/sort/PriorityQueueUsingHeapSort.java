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
public class PriorityQueueUsingHeapSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        priorityqueue h=new priorityqueue();
        h.insert(56);
        h.insert(34);
        h.insert(90);
        h.insert(12);
        h.insert(7);
        h.insert(4);
        h.insert(34);
        h.insert(89);
        h.remove();
        h.display();
        
    }
    
}
