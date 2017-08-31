/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TopologicalSort;

import java.util.Stack;

/**
 *
 * @author ankit
 */
public class TopologicalSort {
    
    //To store the topological order.
    private Stack<Vertex> stack;

    public TopologicalSort() {
        stack = new Stack<>();
    }
    
    //Depth first search implementation for Topological ordering
    public void dfsTopological(Vertex root){
        root.setVisited(true);
        
        for(Vertex v: root.getAdjacencyList()){
            if(!v.isVisited()){
                v.setVisited(true);
                dfsTopological(v);                
            }
        } 
        stack.push(root);
    }

    public Stack<Vertex> getStack() {
        return stack;
    }
}
