package leetcode;

public class IndexOfFirstOccurance {
    public static void main(String[] args) {
        String needle="sad";
        String haystack="easbutsad";
        int res=getResultOfInput(haystack,needle);
        System.out.println(res);
    }

    private static int getResultOfInput(String haystack,String needle) {
        char[] c1=haystack.toCharArray();
        char[] c2=needle.toCharArray();
        int j=0;
        for(int i=0;i<c1.length;i++){
            if(c1[i]==c2[j]){
                int tmp=i;
                i++;j++;
                while(j<c2.length && i<c1.length){
                    if(c1[i]==c2[j]){
                        j++;i++;
                    }else{
                        i=tmp;
                        j=0;
                        break;
                    }
                }
                if(j==c2.length){
                    return tmp;
                }
            }
        }
        return -1;
    }
}
