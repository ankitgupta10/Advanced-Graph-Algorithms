/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DepthFirstSearch;

/**
 *
 * @author ankit
 */
public class AppMain {
    
    public static void main(String args[]){
        
        Vertex vertexR = new Vertex(7);
        Vertex vertex1 = new Vertex(8);
        Vertex vertex2 = new Vertex(9);
        Vertex vertex3 = new Vertex(20);
        Vertex vertex4 = new Vertex(5);
        
        vertexR.addAdjacentVertex(vertex1);
        vertexR.addAdjacentVertex(vertex2);
        vertex1.addAdjacentVertex(vertex2);
        vertex2.addAdjacentVertex(vertex3);
        vertex2.addAdjacentVertex(vertex4);

        DfsAlgorithm dfs = new DfsAlgorithm();
        
        System.out.println("Iterative DFS");     
        dfs.dfsIterative(vertexR);
        
        /*
        set visited to false, since dfsIterative sets them to true
        and then dfsRecursive will never run after that.
        */
        
        vertexR.setVisited(false);
        vertex1.setVisited(false);
        vertex2.setVisited(false);
        vertex3.setVisited(false);
        vertex4.setVisited(false);
        
        System.out.println("\nRecursive DFS");
        dfs.dfsRecursive(vertexR);
    }
}
