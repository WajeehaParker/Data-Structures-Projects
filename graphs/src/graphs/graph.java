/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author Wajeeha Parker
 */
public class graph {
    private final int maxverts = 20;
    private vertex[] vertexlist; // array of vertices
    private int[][] adjmat; // adjacency matrix
    private int nverts;
    public graph()
    {
        vertexlist=new vertex[maxverts];
        adjmat=new int[maxverts][maxverts];
        nverts=0;
        for (int i=0; i<maxverts; i++)
            for (int j=0; j<maxverts; j++)
                adjmat[i][j]=0;
    }
    public void addvertex(char v)
    {
        vertexlist[nverts++]=new vertex(v);
    }
    public void addedge(int s, int e)
    {
        adjmat[s][e]=1;
        adjmat[e][s]=1;
    }
    public void displayvertex(int v)
    {
        System.out.println(vertexlist[v].label);
    }
    public int getadjacentunvisitedvertex(int v)
    {
        for (int i=0; i<nverts; i++)
            if (adjmat[v][i]==1 && vertexlist[i].wasvisited==false)
                return i;
            return -1;
    }
    public void dfs()
    {
        stack s=new stack(nverts);
        vertexlist[0].wasvisited=true;
        displayvertex(0);
        s.push(0);
        while(!s.isempty())
        {
            int v=getadjacentunvisitedvertex(s.peek());
            if (v==-1)
                s.pop();
            else{
                vertexlist[v].wasvisited=true;
                displayvertex(v);
                s.push(v);
            }
        }
        for (int i=0; i<nverts; i++)
            vertexlist[i].wasvisited=false;
    }
    public void bfs()
    {
        queue q= new queue(nverts);
        vertexlist[0].wasvisited=true;
        displayvertex(0);
        q.enqueue(0);
        while(!q.isempty())
        {
            int v2=q.dequeue();
            int v;
            while((v=getadjacentunvisitedvertex(v2))!=-1)
            {
                vertexlist[v].wasvisited=true;
                displayvertex(v);
                q.enqueue(v);
            }
        }
        for (int i=0; i<nverts; i++)
                vertexlist[i].wasvisited=false;
                
    }
}
