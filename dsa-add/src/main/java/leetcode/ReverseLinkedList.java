package leetcode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node n=new Node(1);
        n.next=new Node(2);
        n.next.next=new Node(3);
        n.next.next.next=new Node(4);
        n.next.next.next.next=new Node(5);

      //  Node.getNode(n);
        Node mid=Node.findMid(n);
        System.out.println("mid num "+mid.data);
        Node rev=Node.reverse(n);
        Node.getNode(rev);

    }

}

class Node<T>{
    T data;
    Node next;

    Node(T data){
        this.data=data;
    }

    public static void getNode(Node n){
        while (n.next!=null){
            System.out.println(n.data);
             n=n.next;
        }
        System.out.println(n.data);
    }

    public static Node reverse(Node node) {
        Node current = node;
        Node prev = null;

        while (current!= null) {
             Node next = current.next;
             current.next=prev;
             prev=current;
             current=next;
        }
        return prev;
    }

    public static Node findMid(Node n) {
        Node slow=n.next;
        Node fast=n.next.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
