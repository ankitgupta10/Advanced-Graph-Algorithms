/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TopologicalSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author ankit
 */
public class AppMain {
    
    public static void main(String args[]){
        
        TopologicalSort tSort = new TopologicalSort();
        List<Vertex> graph = new ArrayList<>();
        
        /*
        To print topological sort,
        we need to know the number oof vertices on the graph
        hence we add all the vertives to a graph list.
        */
        graph.add(new Vertex(10));
        graph.add(new Vertex(11));        
        graph.add(new Vertex(12));
        graph.add(new Vertex(13));
        graph.add(new Vertex(14));
        
        graph.get(0).addAdjacentVertex(graph.get(2));
        graph.get(0).addAdjacentVertex(graph.get(3));
        
        graph.get(1).addAdjacentVertex(graph.get(3));
        
        graph.get(2).addAdjacentVertex(graph.get(1));
        graph.get(2).addAdjacentVertex(graph.get(4));
        
        graph.get(4).addAdjacentVertex(graph.get(1));
        graph.get(4).addAdjacentVertex(graph.get(3));
        
        tSort.dfsTopological(graph.get(0));
        Stack<Vertex> tOrder = tSort.getStack();
        
        System.out.println("Topological Ordering or Topological Sort is:\n");
        
        for(int i = 0; i < graph.size(); i++){
            Vertex current = tOrder.pop();
            System.out.print(current + " ");
        }
        
    }
}
