public class arbitraryLinkedList {
    public class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public static Node copyRandomList(Node head) {
        if(head == null) return null;

        copyNodes(head);
        setRandoms(head);
        return extractList(head);
    }
    
    public static void copyNodes(Node head){
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            Node node = new Node(curr.val);

            curr.next = node;
            node.next = next;

            curr = next; 
        }
    }

    public static void setRandoms(Node head){
        Node curr = head;
        while(curr != null){
            if(curr.random != null)
            curr.next.random = curr.random.next;
           curr = curr.next.next;
        }
    }

    public static Node extractList(Node head){
        Node curr = head;
        Node dummy = new Node(-1);
        Node prev = dummy;

        while(curr != null){
            Node next = curr.next.next;
            prev.next = curr.next;

            curr.next = next;

            prev = prev.next;
            curr = curr.next;
        }

        return dummy.next;
    }
}
