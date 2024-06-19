package main.Materia.Controllers;

import java.util.Stack;

import main.Materia.Models.Node;

public class ArbolBinario {

    //Recorrido del arbol de tipo preOrder
    public void preOrderLoop(Node nodeRoot){
        if (nodeRoot==null) {
            return ;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(nodeRoot);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.getValue()+" ");
            //Agregar los hijos de la derecha a la pila
            if (node.getRight() != null) {
                stack.push(node.getRight());
                }
            //Agregar los hijos de la izquierda a la pila
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
    }
    public void preOrderRecursivo(Node nodeRoot){
        if (nodeRoot!=null) {
            System.out.print(nodeRoot.getValue()+" ");
            preOrderRecursivo(nodeRoot.getLeft());
            preOrderRecursivo(nodeRoot.getRight());
            }

    }

    public void postOrderLoop(Node nodeRoot){
        if (nodeRoot == null) {
            return ;
        }

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(nodeRoot);
        while (!stack1.isEmpty()) {
            Node node = stack1.pop();
            stack2.push(node);

            if (node.getLeft()!= null) {
                stack1.push(node.getLeft());
            }
            if (node.getRight()!= null) {
                stack1.push(node.getRight());
            }

        }
        while (!stack2.isEmpty()) {
            Node node = stack2.pop();
            System.out.print(node.getValue()+" ");
        }
    }

    public void postOrderRecursivo(Node nodeRoot){
        if (nodeRoot!=null) {
            postOrderRecursivo(nodeRoot.getLeft());
            postOrderRecursivo(nodeRoot.getRight());
            System.out.print(nodeRoot.getValue()+" ");
            }
    }

    public void inOrderrecursivo(Node nodeRoot){
        if (nodeRoot!=null) {
            inOrderrecursivo(nodeRoot.getLeft());
            System.out.print(nodeRoot.getValue()+" ");
            inOrderrecursivo(nodeRoot.getRight());
        }
    }
}
