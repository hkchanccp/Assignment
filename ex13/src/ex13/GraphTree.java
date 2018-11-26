/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

/**
 *
 * @author hkcha
 */
public class GraphTree {
    
    public Node StartNode;
    
	public ArrayList nodes = new ArrayList();
        //Edges represent to adjacency Matrix
	public int[][] adjMatrix;
	int size;
        
        //add the Graph Node
	public void addNode(Node n){
            nodes.add(n);
	}
 	
	public Node getStartNode(){
            return this.StartNode;
        }
        
        //set the startpoint that mean root node
	public void setStartNode(Node n){
            this.StartNode=n;
	}

	
	//This method connect the node 
	public void connectNode(Node start,Node end){
            if(adjMatrix == null){
                    size = nodes.size();
                    adjMatrix = new int[size][size];
            }

            int startpoint = nodes.indexOf(start);
            int endpoint = nodes.indexOf(end);
            adjMatrix[startpoint] [endpoint] = 1;
            adjMatrix[endpoint] [startpoint] = 1;
	}
	
        //This method is check the unvisited child node
	private Node CheckUnvisitedNode(Node n){
            int index = nodes.indexOf(n);
            int j = 0;
            while(j < size){
                if(adjMatrix[index][j] == 1 && ((Node)nodes.get(j)).visited == false){
                    return (Node)nodes.get(j);
                }
                j++;
            }
            return null;
	}
	
	//BFS traversal 
	public void bfs(){
            Queue q=new LinkedList();
            q.add(this.StartNode);
            printNode(this.StartNode);
            StartNode.visited=true;
            
            while(!q.isEmpty())
            {
                    Node n = (Node)q.remove();
                    Node child = null;
                    while((child = CheckUnvisitedNode(n)) != null)
                    {
                            child.visited = true;
                            printNode(child);
                            q.add(child);
                    }
            }
            //Clear visited nodes
            clearNodes();
	}

	//clearing visited node
	private void clearNodes()
	{
		int i=0;
		while( i < size)
		{
			Node n = (Node)nodes.get(i);
			n.visited = false;
			i++;
		}
	}
	
	//printing the node 
	private void printNode(Node n)
	{
		System.out.print(n.label+" ");
	}

	
	
	
}
