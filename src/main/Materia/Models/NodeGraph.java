package main.Materia.Models;

import java.util.LinkedList;
import java.util.List;

public class NodeGraph {
    private int value;
    private List<NodeGraph> neighborns;

    public NodeGraph(int value){
        this.value = value;
        this.neighborns = new LinkedList<>();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<NodeGraph> getNeighborns() {
        return neighborns;
    }

    public void setNeighborns(List<NodeGraph> neighborns) {
        this.neighborns = neighborns;
    }

    public void addNeighborns(NodeGraph neighborn){
        neighborns.add(neighborn);
    }

    

}
