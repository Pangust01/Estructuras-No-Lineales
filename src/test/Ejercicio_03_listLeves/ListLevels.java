package test.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.List;

import main.Materia.Models.Node;

public class ListLevels {

    public List<List<Node>> listLevels(Node root) {
        if (root == null) {
            throw new UnsupportedOperationException("Unimplemented method 'listLevels'");
        }
        List<Node> raiz = new ArrayList<Node>();
        raiz.add(root);
        while (root!=null) {
            raiz.add(1,root.getLeft());
            raiz.add(1,root.getRight());
        }
        return root;
        
    }

}
