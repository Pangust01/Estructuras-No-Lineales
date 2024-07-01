package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.List;
import main.Materia.Models.NodeGraph;
public class Graph {
    private final List<NodeGraph> nodes;
    public Graph(){
        this.nodes = new ArrayList<>();
    }
    public NodeGraph addNode(int value){
        NodeGraph newNode = new NodeGraph(value);
        nodes.add(newNode);
        return newNode;
    }
    public void addEdge(NodeGraph src, NodeGraph dest){
        src.addNeighborns(dest);
        dest.addNeighborns(src);
    }
    public void printGraph(){
        for (NodeGraph node: nodes) {
            System.out.print("Vertex"+ node.getValue()+":");
            for (NodeGraph neighbor : node.getNeighborns()) {
                System.out.print(" -> "+neighbor.getValue());
            }
            System.out.println();
        }
    }
    public void getDFS(NodeGraph startNode){

    }

    private void getDFSUtil(NodeGraph node, boolean[] visited){

    }

    public void getBFS(NodeGraph startNode){

    }

    public int[][] getAdjacencyMatrix(){
        throw new ArrayIndexOutOfBoundsException("No tiene un arreglo");
    }

    public void printAdjencyMatrix(){
        
    }


}
