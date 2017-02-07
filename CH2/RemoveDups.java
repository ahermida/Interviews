import java.util.*;

public class RemoveDups {
    public static void main(String[] args) {
        System.out.println("Yo");                
        Node n = new Node(3);
        Node n1 = new Node(4);
        Node n2 = new Node(4);
        Node n4 = new Node(4);
        Node n5 = new Node(4);
        Node n3 = new Node(3);
        Node n6 = new Node(3);

        n.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        Node trace = n;
        while (trace != null) {
            System.out.println(trace.data);
            trace = trace.next;
        }
        removeDups(n);
        System.out.println("\nNew:");
        trace = n;
        while (trace != null) {
            System.out.println(trace.data);
            trace = trace.next;
        }
    }
    public static Node removeDups(Node start) {
        Node follow = start;
        HashSet<Integer> seen = new HashSet<Integer>();
        
        seen.add(follow.data);

        //trace through the list by checking next
        while (follow.next != null) {
            if (seen.contains(follow.next.data)) {
                    follow.next = null;
            } else {
                seen.add(follow.next.data);
                follow = follow.next;
            }
        }

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
