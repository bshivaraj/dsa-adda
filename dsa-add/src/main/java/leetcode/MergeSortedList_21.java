package leetcode;

public class MergeSortedList_21 {
    public static void main(String[] args) {
          MyNode n1=new MyNode(1);
          n1.next=new MyNode(2);
          n1.next.next=new MyNode(4);

        MyNode n2=new MyNode(1);
        n2.next=new MyNode(3);
        n2.next.next=new MyNode(4);

       MyNode myNode= mergeList(n1,n2);
        readList(myNode);
    }

    private static void readList(MyNode n1) {
        while (n1.next!=null){
            System.out.print(n1.data+",");
            n1=n1.next;
        }
        System.out.print(n1.data);
    }

    private static MyNode mergeList(MyNode l1, MyNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }

        if(l1.data<l2.data){
            l1.next=mergeList(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeList(l1,l2.next);
            return l2;
        }

    }
}
class MyNode{
    MyNode next;
    int data;

    MyNode(int data){
        this.data=data;
    }
}
