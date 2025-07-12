package leetcode;

public class CountOfSubString {
    public static void main(String[] args) {
        String s="abcdabceabcfabch",s1="abc";
        System.out.println(getCountOfSubString(s,s1));
    }
    private static int getCountOfSubString(String s,String s1) {
        int count=0,index=0;
        while ((index = s.indexOf(s1, index)) != -1) {
            count++;
            index += s1.length(); // move index to end of found substring to avoid overlap
        }
        return count;
    }
}
