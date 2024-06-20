package test.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int depthleft = maxDepth(root.getLeft());
        int depthright = maxDepth(root.getRight());
        return Math.max(depthleft, depthright)+1;

    }

}
