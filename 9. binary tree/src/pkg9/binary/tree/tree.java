/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.binary.tree;

import java.util.Stack;

/**
 *
 * @author Wajeeha Parker
 */
public class tree {
    private node root=null;
    public node find(int key)
    {
        node current=root;
        if (current.getdata()!=key)
        {
            if (key<current.getdata())
                current=current.leftchild;
            else
                current=current.rightchild;
            if (current==null)
                return null;
        }
        return current;
    }
    public void insert(int key)
    {
        node temp= new node(key);
        if (root==null)
            root=temp;
        else
        {
            node current=root;
            node parent;
            while(true)
            {
                parent=current;
                if (key<current.getdata())
                {
                    current=current.leftchild;
                    if (current==null)
                    {
                        parent.leftchild=temp;
                        return;
                    }
                }
                else{
                    current=current.rightchild;
                    if (current==null)
                    {
                        parent.rightchild=temp;
                        return;
                    }
                }
            }
            
        }
    }
    public void delete(int key)
    {
        node current=root;
        node parent=root;
        boolean isleftchild=true;
        while (current.getdata()!=key)
        {
            parent=current;
            if (key<current.getdata())
            {
                isleftchild=true;
                current=current.leftchild;
            }
            else{
                isleftchild=false;
                current=current.rightchild;
            }
            if (current==null)
            {
                System.out.println("Data not present");
                return;
            }
        }
        if (current.leftchild==null && current.rightchild==null)
        {
            if (current==root)
                root=null;
            else if (isleftchild)
                parent.leftchild=null;
            else parent.rightchild=null;
                        
        }
        else if (current.rightchild==null)
        {
            if (current==root)
                root=current.leftchild;
            else if (isleftchild)
                parent.leftchild=current.leftchild;
            else parent.rightchild=current.leftchild;
        }
        else if (current.leftchild==null)
        {
            if (current==root)
                root=current.rightchild;
            else if (isleftchild)
                parent.leftchild=current.rightchild;
            else parent.rightchild=current.rightchild;
        }
        else
        {
            node s=successor(current);
            if (current==root)
                root=s;
            else if (isleftchild)
                parent.leftchild=s;
            else parent.rightchild=s;
            s.leftchild=current.leftchild;
        }
    }
    public node successor(node n)
    {
        node sparent = n;
        node s = n;
        node current = n.rightchild; // go to right child
        while(current != null) // until no more
        { // left children,
            sparent = s;
            s = current;
            current = current.leftchild; // go to left child
        }
        // if successor not
        if(s != n.rightchild) // right child,
        { // make connections
            sparent.leftchild = s.rightchild;
            s.rightchild = n.rightchild;
        }
        return s;
    }
    public void transverse(int type)
    {
        switch(type)
        {
            case 1: 
                System.out.println("Pre Order Transversal:");
                preorder(root);
                break;
            case 2: 
                System.out.println("In Order Transversal:");
                inorder(root);
                break;
            case 3: 
                System.out.println("Post Order Transversal:");
                postorder(root);
                break;
        }
    }
    public void preorder(node root)
    {
        if (root!=null)
        {
           System.out.println(root.getdata());
           preorder(root.leftchild);
           preorder(root.rightchild);
        }
    }
    public void inorder(node root)
    {
        if (root!=null)
        {
           inorder(root.leftchild);
           System.out.println(root.getdata());
           inorder(root.rightchild);
        }
    }
    public void postorder(node root)
    {
        if (root!=null)
        {
           postorder(root.leftchild);
           postorder(root.rightchild);
           System.out.println(root.getdata());
        }
    }
    
    public void display()
    {
        Stack s= new Stack();
        s.push(root);
        int blank=32;
        boolean emptyrow=false;
        while(emptyrow==false)
        {
            Stack store=new Stack();
            emptyrow=true;
            for (int i=0; i<blank; i++)
                System.out.println(" ");
            while(s.isEmpty()==false)
            {
                node temp=(node)s.pop();
                if (temp!=null)
                {
                    System.out.print(temp.getdata());
                    store.push(temp.leftchild);
                    store.push(temp.rightchild);
                    if (temp.leftchild!=null || temp.rightchild!=null)
                        emptyrow=false;
                }
                else{
                    System.out.println("--");
                    store.push(null);
                    store.push(null);
                }
                for (int i=0; i<blank*2-2; i++)
                    System.out.println(" ");
            }
        }
        
    }
}
