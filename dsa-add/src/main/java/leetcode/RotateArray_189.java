package leetcode;

import java.util.Arrays;

public class RotateArray_189 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
         k=k % arr.length;
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] reverseArray(int[] arr, int start,int end) {
        while(start<end){
            int tmp=arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;
            start++;
            end--;
       }
        //System.out.println("out "+ Arrays.toString(arr));
        return arr;
    }
}
