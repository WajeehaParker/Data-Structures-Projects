/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing.open.addressing.quadratic.probing;

/**
 *
 * @author Wajeeha Parker
 */
public class HashingOpenAddressingQuadraticProbing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hashtable table=new hashtable(7);
        table.insert(129);
        table.insert(6);
        table.insert(7);
        table.insert(5);
        table.displaytable();
        System.out.println();
        table.delete(5);
        table.delete(129);
        table.delete(7);
        table.displaytable();
        System.out.println();
        table.insert(99);
        table.insert(78);
        table.displaytable();
        table.find(6);
        
        
        
    }
    
}
