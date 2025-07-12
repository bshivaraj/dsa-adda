package leetcode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        //complexity O(n)
        int search=8;
        int first=0,last=arr.length-1;
        boolean res=findNum(arr,search,first,last);
        System.out.println(res);
    }

    private static boolean findNum(int[] arr, int search,int first,int last) {
        if(first<=last){
            int mid=first+(last-first)/2;
            if(arr[mid]==search){
                return true;
            }
            if(search<arr[mid]){
                return findNum(arr,search,first,mid-1);
            }else if(search>arr[mid]){
                return findNum(arr,search,mid+1,last);
            }
        }
        return false;
    }
}
