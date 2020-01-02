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
public class Heap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        heaps h=new heaps(10);
        h.insert(56);
        h.insert(34);
        h.insert(90);
        h.insert(12);
        h.insert(7);
        h.insert(4);
        h.insert(34);
        h.insert(89);
        h.remove();
        h.displayheap();
        
    }
    
}
