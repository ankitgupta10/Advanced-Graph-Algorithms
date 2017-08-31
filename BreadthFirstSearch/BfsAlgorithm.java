/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ankit
 */
public class BfsAlgorithm {
    
    public void bfsAlgo(Vertex root){
        
        Queue<Vertex> queue = new LinkedList<>();
        
        root.setVisited(true);
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            Vertex current = queue.remove();
            
            System.out.print(current.getData() + " ");
            
            for(Vertex v: current.getAdjacencyList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
