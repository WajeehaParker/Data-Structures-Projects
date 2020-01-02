/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infix.to.postfix;

/**
 *
 * @author Wajeeha Parker
 */
public class InfixToPostfix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        converter c=new converter();
        System.out.println(c.converter("(a+b)*(c-d)"));
        
    }
    
}
