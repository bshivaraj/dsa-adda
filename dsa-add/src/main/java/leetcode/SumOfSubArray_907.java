package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class SumOfSubArray_907 {
    public static void main(String[] args) {
      //  int[] arr={3,1,2,4};
        int[] arr={3,7,8,4};
        System.out.println(subArraySum(arr));


        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();  // remove smaller/equal elements — not useful
            }

            // stack.peek() is now the next greater on the left, or stack is empty
            
            if (stack.isEmpty()) {
                result[i] = -1; // no greater element on the left
            } else {
                result[i] = stack.peek();
            }

            // Add current element for future elements to use
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(result));
    }

    private static int subArraySum(int[] arr) {
        int size=arr.length,sum=0; int t1=Integer.MAX_VALUE;
        if(size<=3){
            for(int i=0;i<size;i++){
                t1=Math.min(t1,arr[i]);
            }
            return t1;
        }
        for(int i=0;i<size;i++){
            int temp=Integer.MAX_VALUE;
            for(int j=i;j<size;j++){
                for(int k=i;k<=j;k++){
                    temp=Math.min(temp,arr[k]);
                }
                sum+=temp;
            }
        }
        return sum;
    }
}
