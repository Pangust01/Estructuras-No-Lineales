package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.NodeGraph;

public class Graph {
    private final List<NodeGraph> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public NodeGraph addNode(int value) {
        NodeGraph newNode = new NodeGraph(value);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge(NodeGraph src, NodeGraph dest) {
        src.addNeighborns(dest);
        dest.addNeighborns(src);
    }

    public void printGraph() {
        for (NodeGraph node : nodes) {
            System.out.print("Vertex" + node.getValue() + ":");
            for (NodeGraph neighbor : node.getNeighborns()) {
                System.out.print(" -> " + neighbor.getValue());
            }
            System.out.println();
        }
    }

    public void getDFS(NodeGraph startNode) {

    }

    private void getDFSUtil(NodeGraph node, boolean[] visited) {
        visited[node.getValue()] = true;
        System.out.print(" -> " + node.getValue());

        for (NodeGraph neighbor : node.getNeighborns()) {
            if (!visited[neighbor.getValue()]) {
                getDFSUtil(neighbor, visited);
            }
        }
    }

    public void getBFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()];
        Queue<NodeGraph> queue = new LinkedList<>();
        queue.add(startNode);
        visited[startNode.getValue()] = true;

        while (!queue.isEmpty()) {
            NodeGraph current = queue.poll();
            System.out.print(" -> " + current.getValue());

            for (NodeGraph neighbor : current.getNeighborns()) {
                if (!visited[neighbor.getValue()]) {
                    queue.add(neighbor);
                    visited[neighbor.getValue()] = true;
                }
            }
        }
    }

    public int[][] getAdjacencyMatrix() {
        throw new ArrayIndexOutOfBoundsException("No tiene un arreglo");
    }

    public void printAdjencyMatrix() {

    }

}
