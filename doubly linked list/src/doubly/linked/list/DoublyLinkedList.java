/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubly.linked.list;

/**
 *
 * @author Wajeeha Parker
 */
public class DoublyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        linkedlist l=new linkedlist();
        l.insertfirst(5);
        l.insertfirst(4);
        l.insertfirst(2);
        l.insertfirst(1);
        l.deletefirst();
        l.insertafter(3, 2);
        l.insertfirst(0);
        l.displaylist();
    }
    
}
