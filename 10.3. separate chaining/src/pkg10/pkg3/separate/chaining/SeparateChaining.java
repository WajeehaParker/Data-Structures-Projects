/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkg3.separate.chaining;

/**
 *
 * @author Wajeeha Parker
 */
public class SeparateChaining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hashtable hash=new hashtable(7);
        hash.insert(34);
        hash.insert(56);
        hash.insert(78);
        hash.insert(12);
        hash.insert(89);
        hash.insert(33);
        hash.insert(90);
        hash.displaytable();
        hash.delete(11);
  //      hash.displaytable();
        hash.find(4);
    }
    
}
