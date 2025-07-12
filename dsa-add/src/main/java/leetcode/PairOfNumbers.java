package leetcode;

public class PairOfNumbers {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        int target =6;
        int[] res=getTwoIndex(arr,target);
        System.out.println(res[0]+" "+res[1]);
    }

    private static int[] getTwoIndex(int[] arr, int target) {
        int[] res=new int[2];int i=0,j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(target==sum){
              res[0]=i;
              res[1]=j;
              break;
            }else if(sum<target){
               i++;
            }else{
                j--;
            }
        }

        return res;
    }
}
