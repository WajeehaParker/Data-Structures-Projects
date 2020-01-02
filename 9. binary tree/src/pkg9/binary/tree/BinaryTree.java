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
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tree t=new tree();
        t.insert(5);
        t.insert(78);
        t.insert(45);
        t.insert(9);
        t.insert(2);
        t.insert(44);
        t.transverse(2);
        
    }
    
}
