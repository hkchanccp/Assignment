/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13;

/**
 *
 * @author hkcha
 */
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lets create nodes 
        Node A=new Node('A');
        Node B=new Node('B');
        Node C=new Node('C');
        Node D=new Node('D');
        Node E=new Node('E');

        //Create the graph, add nodes
        GraphTree g=new GraphTree();
        g.addNode(A);
        g.addNode(B);
        g.addNode(C);
        g.addNode(D);
        g.addNode(E);

        //set the start node is a
        g.setStartNode(A);

        //set the connection with all node 
        g.connectNode(A,B);
        g.connectNode(A,C);
        g.connectNode(A,D);
        g.connectNode(B,E);

        //Print bfs
        System.out.println("BFS traversal is ");
        g.bfs();
		
    }
    
}
