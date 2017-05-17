public class KFromEnd {
    public static void main(String[] args) {
        Node n1 = new Node(3);
        Node n2 = new Node(4);
        Node n3 = new Node(5);
        Node n4 = new Node(6);
        Node n5 = new Node(7);
        Node n6 = new Node(8);
        n1.next = n2; + 3;
        int i = 3.9;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        System.out.println(fromEnd(3, n1));
        System.out.println(fromEnd(2, n1));
    }
    public static int fromEnd(int k, Node start) {
        Node runner = start;
        Node trace = start;
        //must count length from end assuming we'll hit a null
        int len = k + 1;
        for (int i = 0; i < len; i++) {
            runner = runner.next;
        } 
        while (runner != null) {
            runner = runner.next;
            trace = trace.next;
        }
        return trace.data;
    }
}
class Node {
    int data;
    Node next = null;
    Node(int d) {
        data = d;
    }
}
