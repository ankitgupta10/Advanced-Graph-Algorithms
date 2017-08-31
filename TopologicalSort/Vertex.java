/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TopologicalSort;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ankit
 */
public class Vertex {
    
    private int data;
    private boolean visited;
    private List<Vertex> adjacencyList;

    public Vertex(int data) {
        this.data = data;
        this.visited = false;
        this.adjacencyList = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<Vertex> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public void addAdjacentVertex(Vertex v){
        this.adjacencyList.add(v);
    }
    @Override
    public String toString() {
        return "" + this.data;
    }
    
    
    
        
}
