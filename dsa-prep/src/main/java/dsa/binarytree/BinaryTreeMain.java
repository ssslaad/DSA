package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import common.Node;

public class BinaryTreeMain{
    public static Node createBinaryTree(){
        Node rootNode = new Node(1);
        rootNode.setLeft(new Node(2));
        rootNode.setRight(new Node(3));
        rootNode.getLeft().setLeft(new Node(4));
        rootNode.getLeft().setRight(new Node(5));
        rootNode.getRight().setLeft(new Node(6));
        rootNode.getRight().setRight(new Node(7));
        rootNode.getRight().getRight().setLeft(new Node(8));
        return rootNode;
    }

    public static void main(String[] args){
        Node rootNode = createBinaryTree();
        //var result = new ArrayList<Integer>();
        List<List<Integer>> resultLevelwise = new LinkedList<List<Integer>>();
        BinaryTreeTraversals.traverseLevelOrder(rootNode,resultLevelwise);
        System.out.println(resultLevelwise);
        return;
    }
}





