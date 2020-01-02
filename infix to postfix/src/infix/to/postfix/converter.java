/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infix.to.postfix;

import java.util.Stack;

/**
 *
 * @author Wajeeha Parker
 */
public class converter {
    public String converter(String exp)
    {
        String result=new String("");
        Stack stack = new Stack();
        for (int i=0; i<exp.length(); i++)
        {
            char c=exp.charAt(i);
            if (Character.isLetterOrDigit(c))
                result+=c;
            else if(c=='(')
                stack.push(c);
            else if (c==')')
            {
                while((!stack.isEmpty())&&(!stack.peek().equals('(')))
                    result+=stack.pop();
                if((stack.isEmpty())&&(!stack.peek().equals('(')))
                    return "Invalid Expression";
                else 
                    stack.pop();
            }
            else
            {
                while(!stack.isEmpty() && precedence(c)<=precedence(stack.peek().toString().charAt(0)))
                    result+=stack.pop();
                stack.push(c);
            }
        }
        while(!stack.isEmpty())
            result+=stack.pop();
        return result;
    }
    public int precedence(char c)
    {
        int p=0;
        switch(c)
        {
            case '+':
            case '-':
                p=1;
                break;
            case '*':
            case '/':
                p=2;
                break;
            case '^':
                p=3;
                break;
        }
        return p;
    }
}
