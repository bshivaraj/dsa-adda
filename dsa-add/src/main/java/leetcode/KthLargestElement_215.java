package leetcode;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement_215 {
    public static void main(String[] args) {
        int[] arr={10,2,3,45,67,89,99};

        int k=3;
        PriorityQueue res=getLargest(arr,k);
       System.out.println(res);
    }

    private static PriorityQueue getLargest(int[] arr,int k) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            priorityQueue.add(arr[i]);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        return priorityQueue;
    }
}
