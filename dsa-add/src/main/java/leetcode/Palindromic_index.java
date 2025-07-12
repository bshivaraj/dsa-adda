package leetcode;

public class Palindromic_index {
    public static void main(String[] args) {
        String s="abac";
        int index=getIndex(s);
        System.out.println(index);
    }

    private static int getIndex(String s) {
        int end=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(end)){
                if(isPalindrome(s,i+1,end)){
                    return i;
                }else{
                    if(isPalindrome(s,i,end-1)){
                        return end;
                    }
                }
            }
            end--;
        }
       return -1;
    }
    public static boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            end--;
            start++;
        }
        return true;
    }
}
