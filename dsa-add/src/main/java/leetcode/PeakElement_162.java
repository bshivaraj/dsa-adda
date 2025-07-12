package leetcode;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PeakElement_162 {

    public static void main(String[] args) {
        //int[] arr={1,3,6,4,2,0};
        int[] arr={1,3,6,6,6,7,4,3,2,1};
        //int[] arr={1,5,8,4,2,0};
        int peak=getPeak(arr);
        System.out.println(peak);

    }

    private static int getPeak(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]<arr[mid+1]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}
