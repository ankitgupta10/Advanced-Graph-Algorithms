/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DepthFirstSearch;

import java.util.Stack;

/**
 *
 * @author ankit
 */
public class DfsAlgorithm {

    public void dfsIterative(Vertex root) {
        Stack<Vertex> stack = new Stack<>();

        root.setVisited(true);
        stack.push(root);

        while (!stack.isEmpty()) {
            Vertex current = stack.pop();
            System.out.print(current + " ");

            for (Vertex v : current.getAdjacencyList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    stack.push(v);
                }
            }
        }
    }

    public void dfsRecursive(Vertex root) {
        root.setVisited(true);

        System.out.print(root + " ");

        for (Vertex v : root.getAdjacencyList()) {
            if (!v.isVisited()) {
                dfsRecursive(v);
            }
        }
    }
}
