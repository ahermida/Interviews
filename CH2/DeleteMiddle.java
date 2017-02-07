public class DeleteMiddle {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node t = n1;
        System.out.println("Old:");
        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
        deleteMiddle(n1);
        System.out.println("NEW");
        t = n1;
        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }
    public static Node deleteMiddle(Node start) {
        Node runner = start;
        Node trace = runner;
        while (runner != null) {
            runner = runner.next;
            if (runner == null) {
                break;
            }
            runner = runner.next;
            trace = trace.next;
        }
        trace.data = trace.next.data;
        trace.next = trace.next.next;
        return start;
    }
}

class Node {
    int data;
    Node next = null;
    Node(int d) {
        data = d;
    }
}
