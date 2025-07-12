package leetcode;

import java.util.Scanner;

public class Tree {
    static Scanner scanner=null;
    public static void main(String[] args) {
        scanner=new Scanner(System.in);
        TreeNode treeNode=createTree();
       // System.out.println(treeNode);
        inorder(treeNode); //LNR
        preOrder(treeNode);//NLR
        postOrder(treeNode);//LRN
    }
    static <T> TreeNode createTree(){
        TreeNode head=null;

        System.out.println("Enter data: ");
        int data=scanner.nextInt();

        if(data==-1){
            return null;
        }
        TreeNode node=new TreeNode(data);

        System.out.println("Enter left data: "+data);
        node.left=createTree();

        System.out.println("Enter right data: "+data);
        node.right=createTree();

        return node;
    }

    static void postOrder(TreeNode treeNode){
        if(treeNode==null)return;

        postOrder(treeNode.left);
        postOrder(treeNode.right);
        System.out.println(treeNode.data);
    }

    static void preOrder(TreeNode treeNode){
        if(treeNode==null)return;

        System.out.println(treeNode.data);
        preOrder(treeNode.left);
        preOrder(treeNode.right);

    }

    static void inorder(TreeNode treeNode){
        if(treeNode==null)return;

        inorder(treeNode.left);
        System.out.println(treeNode.data);
        inorder(treeNode.right);

    }
}


class TreeNode<T>{
    T data;
    TreeNode left;
    TreeNode right;

    TreeNode(T data){
        this.data=data;
    }
}
