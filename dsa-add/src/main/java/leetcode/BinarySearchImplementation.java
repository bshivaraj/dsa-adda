package leetcode;

public class BinarySearchImplementation {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(9);
        binaryTree.insert(8);
        binaryTree.insert(7);
        var root=binaryTree.insert(100);

        binaryTree.LeftTree(root);
        binaryTree.RightTree(root);
    }
}
class BinaryTree<T extends Comparable<T>>{

    NodeTree<T> root;

    public NodeTree insert(T data) {
       root=insertRecrcive(root,data);
       return root;
    }

    public NodeTree insertRecrcive(NodeTree<T> root,T data){
       if(root==null){
           root=new NodeTree(data);
       }
       if(data.compareTo(root.data)<0){
         root.leftNode=insertRecrcive(root.leftNode,data);
       } else if (data.compareTo(root.data)>0) {
           root.rightNode=insertRecrcive(root.rightNode,data);
       }
       return root;
    }

    public void LeftTree(NodeTree root){
        System.out.println(root.data);
        while (root.leftNode!=null){
            System.out.println(root.leftNode.data);
            root=root.leftNode;
        }
    }

    public void RightTree(NodeTree root) {
        while (root.rightNode!=null){
            System.out.println(root.rightNode.data);
            root=root.rightNode;
        }
    }
}
class NodeTree<T>{
    NodeTree<T> rightNode;
    NodeTree<T> leftNode;
    T data;

    public NodeTree(T data) {
        this.data=data;
    }
}
