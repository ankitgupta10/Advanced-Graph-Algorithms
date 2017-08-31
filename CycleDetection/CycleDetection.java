/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CycleDetection;

import java.util.List;

/**
 *
 * @author ankit
 */
public class CycleDetection {
    
    public void detectCycles(List<Vertex> graph){
        for(int i=0; i<graph.size(); i++){
            if(!graph.get(i).isVisited()){
                dfs(graph.get(i));
            }
        }
    }
    
    public void dfs(Vertex vertex){
        vertex.setBeingVisited(true);
        
        for(Vertex v: vertex.getAdjacencyList()){
            if(v.isBeingVisited()){
                System.out.println("Backward edge to vertex with value: " + v);
                System.out.println("There is Cycle!");
                return;
            }
            if(!v.isVisited()){
                v.setVisited(true);
                dfs(v);
            }
            
            vertex.setVisited(true);
            vertex.setBeingVisited(false);
        }
    }
}
