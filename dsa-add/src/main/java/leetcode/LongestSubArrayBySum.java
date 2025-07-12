package leetcode;

public class LongestSubArrayBySum {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,0,0,0,6,7,8,9,10};
        int target=15;
        int[] res=longestSubArrayBySum(nums,target);
        System.out.println(res);
    }

    private static int[] longestSubArrayBySum(int[] nums,int target) {
        int[] res=new int[2];
        int i=0,j=0,tmp=0,start=0,end=0,diff=0,tmpDiff=0;
        while(i<nums.length && j<nums.length){
            if(tmp<=target){
                tmp=tmp+nums[j];
            }

            if(tmp==target && tmpDiff>diff){
                start=i;
                end=j;
                tmpDiff=end-start;
            }
            if(tmp>target){
                tmp=tmp-nums[i];
                i++;
            }
            if(tmpDiff>diff){
                diff=tmpDiff;
            }
            if(tmp<target){
                j++;
            }
        }
        res[0]=start;
        res[1]=end;
        return res;
    }
}
