package test.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import main.Materia.Models.Node;

public class ListLevels {

    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> arregloFinal = new ArrayList<List<Node>>();
        if (root == null) {
            return arregloFinal;
        }
        LinkedList<Node> cola= new LinkedList<Node>();
        cola.offer(root);
        while (!cola.isEmpty()) {
            int tamanioVar = cola.size();
            List<Node> actual = new ArrayList<Node>();
            for (int i = 0; i < tamanioVar; i++) {
                Node node = cola.poll();
                actual.add(node);
                if (node.getLeft() != null) {
                    cola.offer(node.getLeft());
                }
                if (node.getRight() != null) {
                    cola.offer(node.getRight());
                }
    
            }
            arregloFinal.add(actual);

        }

        return arregloFinal;
        
    }

}
