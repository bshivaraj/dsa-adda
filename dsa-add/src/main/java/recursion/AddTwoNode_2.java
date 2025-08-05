package recursion;

public class AddTwoNode_2 {

    public static void main(String[] args) {
        Node n1=new Node(2);
        n1.next=new Node(4);
        n1.next.next=new Node(3);

        Node n2=new Node(5);
        n2.next=new Node(6);
        n2.next.next=new Node(4);
        Node n=sum(n1,n2,0);
        System.out.println(n);
    }
    static Node n3;
    private static Node sum(Node n1, Node n2,int carry) {
         if(n1==null && n2==null  && carry==0){
             return null;
         }
         int v1=(n1==null)?0:n1.val;
         int v2=(n2==null)?0:n2.val;
         int total=v1+v2+carry;
         int digit = total % 10;
         int newCarry = total / 10;

        Node result = new Node(digit);

        result.next = sum(n1 != null ? n1.next : null, n2 != null ? n2.next :null, newCarry);
        return result;
    }
}
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
    public Node() {
    }
}
