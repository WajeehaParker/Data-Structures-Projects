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
public class Graphs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        graph g=new graph();
        g.addvertex('A');
        g.addvertex('B');
        g.addvertex('C');
        g.addvertex('D');
        g.addvertex('E');
        g.addedge(0, 1);
        g.addedge(1, 2);
        g.addedge(0, 3);
        g.addedge(3, 4);
        System.out.println("Visits: ");
        g.dfs();
        System.out.println();
        g.bfs();
    }
    
}
