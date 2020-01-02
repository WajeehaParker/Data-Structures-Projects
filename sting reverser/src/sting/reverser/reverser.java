/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sting.reverser;

/**
 *
 * @author Wajeeha Parker
 */
public class reverser {
    String input, output;
    public reverser(String s)
    {
        this.input=s;
    }
    public String doreverse()
    {
        stack s=new stack(input.length());
        for (int i=0; i<input.length(); i++)
            s.push(input.charAt(i));
        output="";
        while(!s.isempty())
            output+=s.pop();
        return output;
    }
}
