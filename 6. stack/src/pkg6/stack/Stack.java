/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.stack;

/**
 *
 * @author Wajeeha Parker
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stackx s=new stackx();
        s.puch(1);
        s.puch(2);
        s.puch(3);
        s.puch(4);
        s.puch(5);
        for (int i=0; i<5; i++)
        {
            System.out.println(s.pop());
        }
    }
    
}
