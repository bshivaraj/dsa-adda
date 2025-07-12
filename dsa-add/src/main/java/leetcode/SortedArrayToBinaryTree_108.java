package leetcode;

public class SortedArrayToBinaryTree_108 {
    public static void main(String[] args) {
      int[] arr={-10,-3,0,5,9};
      MyTreeNode node=sortedArrayToTree(arr);
      System.out.println(node.val);
      readTree(node.right,node.left);
    }

    private static void readTree(MyTreeNode rightNode,MyTreeNode leftNode) {
         while(rightNode!=null || leftNode!=null){
             if(leftNode!=null){
                 System.out.println(leftNode.val);
                 leftNode=leftNode.left;
             }

             if(rightNode!=null){
                 System.out.println(rightNode.val);
                 rightNode=rightNode.right;
             }
         }
    }

    private static MyTreeNode sortedArrayToTree(int[] nums) {
        return dfs(nums,0,nums.length-1);
    }

    private static MyTreeNode dfs(int[] nums, int start, int end){
        if(end<start){
            return null;
        }
        int mid=(start+end)/2;
        MyTreeNode tree=new MyTreeNode(nums[mid]);
        tree.left=dfs(nums,start,mid-1);
        tree.right=dfs(nums,mid+1,end);
        return tree;
    }
}
class MyTreeNode{
      int val;
      MyTreeNode left;
      MyTreeNode right;
      MyTreeNode(int val) { this.val = val; }
}
