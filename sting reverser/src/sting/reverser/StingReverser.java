/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sting.reverser;

import java.util.Scanner;

/**
 *
 * @author Wajeeha Parker
 */
public class StingReverser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter String");
        String s=input.nextLine();
        reverser r=new reverser(s);
        System.out.println(r.doreverse());
    }
    
}
