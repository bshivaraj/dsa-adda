package leetcode;

public class LinkedListTest {
    public static void main(String[] args) {
        Node1 n=new Node1(1);
        n.next=new Node1(2);
        n.next.next =new Node1(3);
        n.next.next.next=new Node1(4);
        n.next.next.next.next=new Node1(5);

        System.out.println("-----read--------");
        readData(n);
        Node1 revNode=reverseNode(n);
        System.out.println("-----reverse--------");
        readData(revNode);
    }

    private static Node1 reverseNode(Node1 n) {
        Node1 cur=n;
        Node1 prev=null;
        while(cur!=null){
            Node1 nextNode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nextNode;
        }
        return prev;
    }

    private static void readData(Node1 n) {
        Node1 node=n;

        while(node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
}
class Node1<T>{
    Node1 next;
    T data;

    Node1(T data){
        this.data=data;
    }
}
