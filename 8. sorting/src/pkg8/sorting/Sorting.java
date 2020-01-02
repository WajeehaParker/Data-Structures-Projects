/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.sorting;

/**
 *
 * @author Wajeeha Parker
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Merge Sort:");
        mergesort m=new mergesort(8);
        m.insert(45);
        m.insert(33);
        m.insert(67);
        m.insert(12);
        m.insert(4);
        m.msort();
        m.display();
        System.out.println();
        System.out.println("Quick Sort:");
        quicksort q=new quicksort(5);
        q.insert(32);
        q.insert(44);
        q.insert(66);
        q.insert(12);
        q.insert(4);
        q.qsort();
        q.display();
        
        
    }
    
}
