package leetcode;

public class PushDomenos {
    public static void main(String[] args) {
        //int[] arr={1,2,3,4,7,8,4,1,2,9};
        int[] arr={1,2,9,4,2,7};
        //1,2
        //3,4
        //7,8
        //4,1
        //2,9

        int res=getRemoveDominoes(arr);
        System.out.println(res);
    }

    private static int getRemoveDominoes(int[] arr) {
        int size=arr.length/2-1;int k=0,l=0;
        int[] even=new int[size];
        int[] odd=new int[size];
        for(int i=1;i<arr.length-1 && k<size;i=i+2){
            even[k]=arr[i];
            k++;
        }
        for(int j=2;j<arr.length-1 && l<size;j=j+2){
            odd[l]=arr[j];
            l++;
        }

        //2,4,8,1
        //3,7,4,2
        int m=0,n=0;int res=0;
        while(m<size){
            while (n<size){
                if(even[m]==odd[n]){
                    res=res+Math.abs(m-n);
                }
                n++;
            }
            m++;
            n=0;
        }
        if(res==0){
            return -1;
        }
        return res;
    }
}
