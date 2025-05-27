public class BinaryTreeMain{
    public static Node createBinaryTree(){
        Node rootNode = new Node(1);
        rootNode.left(new Node(2));
        rootNode.right(new Node(3));
        rootNode.left().left(new Node(4));
        rootNode.left().right(new Node(5));
        rootNode.right().left(new Node(6));
        rootNode.right().right(new Node(7));
        rootNode.right().right().left(new Node(8));
        return rootNode;
    }

    public static void main(String args[]){
        Node rootNode = createBinaryTree();
        var treeNodes = BinaryTreeTraversals.inOrderTraversal(rootNode);
        return;
    }
}

public record Node(int data, Node left, Node right){}



