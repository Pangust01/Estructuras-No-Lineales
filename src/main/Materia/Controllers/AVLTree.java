package main.Materia.Controllers;

import main.Materia.Models.Node;

public class AVLTree {
    private Node root;
    // Obtener la altura del node
    private int height(Node node){
        if (node==null) {
            return 0;
        }
        return node.getHeight();
    }

    // Metodo que obtenga el factor de balanzeo o quilibrio
    private int getBalance(Node node){
        if (node==null) {
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());
    }
    public Node insert(Node node, int value){
        if (node == null) {
            return new Node(value);
        }
        if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        }else if(value < node.getValue()){
            node.setLeft(insert(node.getLeft(), value));
        }else{
            return node;
        }
        // Actualizar la altura del predecesor o ancestro
        node.setHeight(1+Math.max(height(node.getLeft()),height(node.getRight())));

        //calcular balance
        int balance = getBalance(node);
        // Si el nodo esta desbalanceado se tiene 4 casos:
        /*
         * Caso izquirda - izquierda
         */
        if (balance>1 && value<node.getLeft().getValue()) {
            return rightRotate(node);
        }

        //caso derecha - derecha
        if (balance < -1 && value > node.getRight().getValue()) {
            return leftRotate(node);
        }

        // Caso izquierda - derecha

        if (balance>1 && value>node.getLeft().getValue()) {
            node.setLeft(leftRotate(node.getLeft()));
            return rightRotate(node);
        }

        // caso derecha - izquierda

        if (balance <-1 && value < node.getRight().getValue()) {
            node.setRight(rightRotate(node.getRight()));
            return leftRotate(node);
        }
        //sin cambios o rotaciones
        return node;
        
    }
    public void insert(int value){
        System.out.println("Nodo a insertar sera el "+ value);
        root = insert(root, value);
        printTree();
        System.out.println("\n---------\n");
    }

    private Node rightRotate(Node nodeR){
        Node x = nodeR.getLeft();
        Node temp = x.getRight();
        // realizar rotacion
        x.setRight(nodeR);
        nodeR.setLeft(temp);
        // actualizar alturas
        nodeR.setHeight(Math.max(height(nodeR.getLeft()),height(nodeR.getRight())+1));
        x.setHeight(Math.max(height(x.getLeft()),height(x.getRight())+1));

        // devolver nueva raiz
        return x;
    }
    
    private Node leftRotate(Node nodeL){
        Node y = nodeL.getRight();
        Node temp = y.getLeft();

        //realizar rotacion

        y.setLeft(nodeL);
        nodeL.setRight(temp);
        nodeL.setHeight(Math.max(height(nodeL.getLeft()),height(nodeL.getRight())+1));
        y.setHeight(Math.max(height(y.getLeft()),height(y.getRight())+1));

        return y;
    }

    public void printTree(){
        printTreeNode(root,"",true);
    }

    public void printTreeNode(Node root, String prefix, boolean isLeft) {

        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.getValue());
            if (root.getLeft() != null || root.getRight() != null) {
                if (root.getLeft() != null) {
                    printTreeNode(root.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "├── null");
                }
                if (root.getRight() != null) {
                    printTreeNode(root.getRight(), prefix + (isLeft ? "│   " : "    "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "└── null");
                }
            }
        }
    }
}
