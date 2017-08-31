/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CycleDetection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ankit
 */
public class AppMain {
    
    public static void main(String args[]){
        
        List<Vertex> graph = new ArrayList<>();
        
        CycleDetection cd = new CycleDetection();
        
        Vertex vertex1 = new Vertex(11);
        Vertex vertex2 = new Vertex(12);
        Vertex vertex3 = new Vertex(13);
        Vertex vertex4 = new Vertex(14);
        Vertex vertex5 = new Vertex(15);
        Vertex vertex6 = new Vertex(16);
        
        vertex1.addAdjacentVertex(vertex2);
        vertex2.addAdjacentVertex(vertex3);
        vertex3.addAdjacentVertex(vertex1); //cycle
        
        vertex3.addAdjacentVertex(vertex4);
        
        vertex4.addAdjacentVertex(vertex5);
        vertex5.addAdjacentVertex(vertex6);
        vertex6.addAdjacentVertex(vertex4); //cycle
        
        graph.add(vertex1);
        graph.add(vertex2);
        graph.add(vertex3);
        graph.add(vertex4);
        graph.add(vertex5);
        graph.add(vertex6);
        
        cd.detectCycles(graph);
    }
    
    
    
}
