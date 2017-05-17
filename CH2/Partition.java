public class Partition {
    public static void main(String[] args) {
        
    }
    public static Node partition(Node start, int p) {
        Node trace = start;
        boolean firstBelongsAtEnd = false;
        if (trace.data  >= p) {
            //put at end
            firstBelongsAtEnd = true;
        }
        while (trace.next != null) {
            if (trace.next.data < p) {
                Node nextNext = trace.next.next;
                addToFront(start, trace.next);
                trace.next = nextNext;
            } else {
                trace = trace.next;
            }
        }
        
        //trace is the last 
        if (firstBelongsAtEnd) {
            Node newStart = start.next;
            start.next = null;
            trace.next = start;
            if (trace.data < p) {
                addToFront(newStart, trace);
                return newStart;
            }
        } else {
            if (trace.data < p) {
                    
            }
        }


    }
    private void addToFront(Node start, Node n) {
        Node temp = start.next;
        start.next =  n;
        n.next = temp;
    }
}

class Node {
    int data;
    Node next = null;
    Node(int d) {
        data = d;
    }
}
