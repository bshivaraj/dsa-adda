package leetcode;

import java.util.Arrays;

public class InserationSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,55,6,4};
        int[] res=getSortedArray(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] getSortedArray(int[] arr) {
        int j=0,tmp=0;
        for(int i=1;i<arr.length;i++){
            tmp=arr[i];
            j=i-1;
           while(j>=0 && arr[j]>arr[i]){
                 arr[j+1]=arr[j];
                 j--;
            }
           arr[j+1]=tmp;
        }
        return arr;
    }
}
