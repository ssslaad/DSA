package binarytree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import common.Node;

public class BinaryTreeTraversals{

    public static void traverseInorder(Node node, List<Integer> result){
        if(node == null) return;
        traverseInorder(node.getLeft(),result);
        result.add(node.getData());
        traverseInorder(node.getRight(),result);
    }

    public static void traversePreorder(Node node, List<Integer> result){
        if(node == null) return;
        result.add(node.getData());
        traversePreorder(node.getLeft(),result);
        traversePreorder(node.getRight(),result);
    }

    public static void traversePostorder(Node node, List<Integer> result){
        if(node == null) return;
        traversePostorder(node.getLeft(),result);
        traversePostorder(node.getRight(),result);
        result.add(node.getData());
    }

    public static void traverseLevelOrder(Node node, List<List<Integer>> resultLevelwise){
        if(node == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> subList = new LinkedList<>();
            for(int i=0;i<queueSize;i++){
                var currentNode = queue.peek();
                if(currentNode.getLeft() != null) queue.offer(currentNode.getLeft());
                if(currentNode.getRight() != null) queue.offer(currentNode.getRight());
                subList.add(queue.poll().getData());
            }
            resultLevelwise.add(subList);
        }
    }

}